
<%@ include file="WEB-INF/vues/header.jsp" %>

<div class="row ">
	<c:forEach items="${requestScope.chambres}" var="chambre">
		<div class="col-12 col-sm-6 col-md-4 mb-3">
			<div class="card">
				<img src="img/chambre.jpg" alt="" class="img-fluid"/>
				<div class="d-flex flex-column card-body text-center">
					<a href="${pageContext.request.contextPath}/Ctl_chambre?action=detail&idChambre=${chambre.numChambre}" class="btn btn-outline-primary mt-1">
		            	Détail
					</a>
					<c:if test="${sessionScope.personnel.role == 'admin'}">
						<a href="${pageContext.request.contextPath}/Ctl_chambre?action=delete&idChambre=${chambre.numChambre}" class="btn btn-outline-primary mt-1">
			            	Delete
						</a>
						<a href="${pageContext.request.contextPath}/Ctl_chambre?action=update&idChambre=${chambre.numChambre}" class="btn btn-outline-danger mt-1">
			            	update
						</a>
					</c:if>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<%@ include file="WEB-INF/vues/footer.jsp" %>
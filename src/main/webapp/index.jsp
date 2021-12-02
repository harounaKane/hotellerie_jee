
<%@ include file="WEB-INF/vues/header.jsp" %>

<div class="row ">
	<c:forEach begin="0" step="1" end="15">
		<div class="col-12 col-sm-6 col-md-4 mb-3">
			<div class="card">
				<img src="img/chambre.jpg" alt="" class="img-fluid"/>
				<div class="d-flex flex-column card-body text-center">
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-outline-primary mt-1">
		            	Détail
					</a>
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-outline-primary mt-1">
		            	Delete
					</a>
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-outline-danger mt-1">
		            	update
					</a>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<%@ include file="WEB-INF/vues/footer.jsp" %>
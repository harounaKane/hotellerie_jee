
<%@ include file="WEB-INF/vues/header.jsp" %>

<div class="row ">
	<c:forEach begin="0" step="1" end="5">
		<div class="col-3 mb-3">
			<img src="img/chambre.jpg" alt="" class="img-fluid"/>
			<div class="card" style="width: 18rem;">
				<div class="card-body text-center">
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-primary mt-1">
		            	Détail
					</a>
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-primary mt-1">
		            	Delete
					</a>
					<a href="?action=detail&idChambre=1&prix=50" class="btn btn-danger mt-1">
		            	update
					</a>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<%@ include file="WEB-INF/vues/footer.jsp" %>
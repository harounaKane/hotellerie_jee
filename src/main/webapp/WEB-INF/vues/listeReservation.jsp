<%@ include file="header.jsp" %>

	<h2 class="text-center">Liste réservation</h2>
	
	<div class="row ">
		<c:forEach begin="0" step="1" end="6">
			<div class="col-12 col-sm-6 col-md-4 mb-3">
				<div class="card">
					<div class="bg-info p-2 text-center">Réservation de <strong>Toto</strong></div>
					<img src="img/chambre.jpg" alt="" class="img-fluid"/>
					<div class="d-flex flex-column card-body text-center">
						<a href="${pageContext.request.contextPath}/Reservation?action=retirer&idChambre=1" class="btn btn-outline-primary mt-1">
			            	Retirer
						</a>
						<a href="${pageContext.request.contextPath}/Reservation?action=prolonger&idChambre=1" class="btn btn-outline-primary mt-1">
			            	Prolonger
						</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>

<%@ include file="footer.jsp" %>

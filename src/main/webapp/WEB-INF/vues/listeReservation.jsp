<%@ include file="header.jsp" %>

	<h2 class="text-center">Liste réservation</h2>
	
	<div class="row ">
		<c:forEach items="${requestScope.reservations}" var="reservation">
			<div class="col-12 col-sm-6 col-md-4 mb-3">
				<div class="card">
					<div class="bg-info p-2 text-center">Réservation de <strong>${reservation.client.prenom}</strong></div>
					<img src="img/chambre.jpg" alt="" class="img-fluid"/>
					<div class="d-flex flex-column card-body text-center">
						<a href="${pageContext.request.contextPath}/Reservation?action=retirer&idChambre=1" class="btn btn-outline-primary mt-1">
			            	Retirer
						</a>
						<a data-bs-toggle="modal" data-bs-target="#reserverModal${reservation.client.numClient}" href="${pageContext.request.contextPath}/Reservation?action=prolonger&idChambre=1" class="btn btn-outline-primary mt-1">
			            	Prolonger
						</a>
					</div>
					<div class="text-center">
						<div>date arrivée : ${reservation.dateArrivee}</div>
						<div>date départ : ${reservation.dateDepart}</div>
					</div>
				</div>
			</div>
			
			<div class="modal fade" id="reserverModal${reservation.client.numClient}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">Prolonger une réservation</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			       	<form action="${pageContext.request.contextPath}/Reservation" method="post">
			       		<input type="hidden" value="${reservation.client.numClient}" name="client" />
			       		<input type="hidden" value="${reservation.chambre.numChambre}" name="chmbre" />
						<div class="row">
							<div class="form-group col-12 col-sm-6">
								<label for="">Date arrivée</label>
								<input type="date" name="datearrivee" value="${reservation.dateArrivee}" class="form-control" />
							</div>
							
							<div class="form-group col-12 col-sm-6">
								<label for="">Date départ</label>
								<input type="date" name="dateDepart" value="${reservation.dateDepart}" class="form-control" />
							</div>
						</div>
						
						<input type="submit" class="btn btn-primary mt-2" />
						<input type="reset" class="btn btn-danger mt-2" />
					</form>
			      </div>
			    </div>
			  </div>
			</div>
			
		</c:forEach>
	</div>

<%@ include file="footer.jsp" %>

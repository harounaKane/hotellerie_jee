<%@ include file="header.jsp" %>

	<h2 class="text-center">Ajouter une chambre</h2>
	
	<form action="${pageContext.request.contextPath}/Ctl_chambre" method="post">
		<div class="row">
			<div class="form-group col-12 col-sm-3">
				<label for="">Prix</label>
				<input type="text" name="prix" value="${!empty requestScope.chambre ? chambre : ''}" class="form-control" />
			</div>
			
			<div class="form-group col-12 col-sm-3">
				<label for="">Nombre de lits</label>
				<input type="text" name="nbreLits" class="form-control" />
			</div>
			
			<div class="form-group col-12 col-sm-3">
				<label for="">Nombre de personnes</label>
				<input type="text" name="nbrePers" class="form-control" />
			</div>
			
			<div class="col-12 col-sm-3">
				<label for="">Confort : </label>
				<div class="form-check form-check-inline">
					<input type="radio" name="confort" class="form-check-input" value="1" />				
					<label for="">OUI</label>
				</div>
				<div class="form-check form-check-inline">
					<input type="radio" name="confort" class="form-check-input" value="0" />				
					<label for="">NON</label>
				</div>
			</div>
			
			<div class="form-group col-12 col-sm-6">
				<label for="">Description</label>
				<textarea name="description" cols="30" rows="10" class="form-control"></textarea>
			</div>
			
		</div>
		
		<input type="submit" name="action" value="${!empty requestScope.chambre ? 'Modifier' : 'Ajouter'}" class="btn btn-primary mt-2" />
		<input type="reset" class="btn btn-danger mt-2" />
	</form>

<%@ include file="footer.jsp" %>
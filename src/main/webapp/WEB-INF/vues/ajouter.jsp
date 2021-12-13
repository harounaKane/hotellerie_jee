<%@ include file="header.jsp" %>

	<h2 class="text-center">Ajouter une chambre</h2>
	
	<form action="${pageContext.request.contextPath}/Ctl_chambre" method="post">
		<input type="hidden" name="numChambre" value="${!empty requestScope.chambre ? chambre.numChambre : ''}">
		<div class="row">
			<div class="form-group col-12 col-sm-3">
				<label for="">Prix <span class="text-danger">*</span></label>
				<input type="text" name="prix" value="${!empty requestScope.chambre ? chambre.prix : ''}" class="form-control" />
				 <span class="text-danger">${requestScope.form_erreur.erreurs["prix"]}</span>
			</div>
			
			<div class="form-group col-12 col-sm-3">
				<label for="">Nombre de lits <span class="text-danger">*</span></label>
				<input type="text" name="nbreLits" value="${!empty requestScope.chambre ? chambre.nbreLits : ''}" class="form-control" />
				<span class="text-danger">${requestScope.form_erreur.erreurs["nbreLits"]}</span>
			</div>
			
			<div class="form-group col-12 col-sm-3">
				<label for="">Nombre de personnes <span class="text-danger">*</span></label>
				<input type="text" name="nbrePers" value="${!empty requestScope.chambre ? chambre.nbrePers : ''}" class="form-control" />
				<span class="text-danger">${requestScope.form_erreur.erreurs["nbrePers"]}</span>
			</div>
			
			<div class="form-group col-12 col-sm-6">
				<label for="">Description</label>
				<textarea name="description" cols="30" rows="10" class="form-control"> ${!empty requestScope.chambre ? chambre.description : ''}</textarea>
			</div>
			
				<div class="col-12 col-sm-3 mt-4">
				<label for="">Confort : </label>
				<div class="form-check form-check-inline">
					<input type="radio" ${!empty requestScope.chambre and chambre.confort == 1  ? 'checked' : ''} name="confort" class="form-check-input" value="1" />				
					<label for="">OUI</label>
				</div>
				<div class="form-check form-check-inline">
					<input type="radio" ${!empty requestScope.chambre and chambre.confort == 0  ? 'checked' : ''} name="confort" class="form-check-input"  value="0" />				
					<label for="">NON</label>
				</div>
			</div>
			
		</div>
		
		<input type="submit" name="action" value="${!empty requestScope.chambre ? 'Modifier' : 'Ajouter'}" class="btn btn-primary mt-2" />
		<input type="reset" class="btn btn-danger mt-2" />
	</form>

<%@ include file="footer.jsp" %>
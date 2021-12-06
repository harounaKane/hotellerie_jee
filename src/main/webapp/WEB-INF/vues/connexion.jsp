<%@ include file="header.jsp" %>

	<h2 class="text-center">Connexion</h2>
	
	<form action="${pageContext.request.contextPath}/Personnel" method="post">
		<div class="row">
			<div class="form-group col-12 col-sm-6">
				<label for="">Login</label>
				<input type="text" name="login" class="form-control" />
			</div>
			
			<div class="form-group col-12 col-sm-6">
				<label for="">Mot de passe</label>
				<input type="password" name="mdp" class="form-control" />
			</div>
		</div>
		
		<input type="submit" class="btn btn-primary mt-2" />
		<input type="reset" class="btn btn-danger mt-2" />
	</form>

<%@ include file="footer.jsp" %>

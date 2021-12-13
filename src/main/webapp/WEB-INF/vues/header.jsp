<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

  <title>Hôtellerie</title>
</head>
<body>
  <header class="bg-secondary p-3 text-center mb-5">
    <div class="text-end"><i class="fa fa-power-off"></i></div>
    <a href="${pageContext.request.contextPath}/Home"><h1>Bienvenue sur notre site</h1></a>
    <nav class="navbar navbar-dark">
      	<!-- on teste si la session existe -->
		<c:choose>
			<c:when test="${!empty sessionScope.personnel}">
		        <a class="text-white" href="${pageContext.request.contextPath}/Personnel?action=deconnexion">Se déconnecter </a>
		       <!-- ADMIN & RECEPTIONNISTE -->
		          <a class="text-white" href="${pageContext.request.contextPath}/Reservation?action=reservations">Toutes les réservations </a>
		
		          <!-- ADMIN -->
		          <c:if test="${sessionScope.personnel.role == 'admin'}">
		          	<a class="text-white" href="${pageContext.request.contextPath}/Ctl_chambre?action=ajouter">Ajouter </a>
		          </c:if>
			</c:when>
			<c:otherwise>
				<a data-bs-toggle="modal" data-bs-target="#exampleModal" class="text-white" href="${pageContext.request.contextPath}/Personnel?action=connexion">Se connecter </a>
			</c:otherwise>
		</c:choose>
    </nav>
  </header>
  <main class="container-fluid bg-light">

	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Se connecter</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
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
	      </div>
	    </div>
	  </div>
	</div>
	

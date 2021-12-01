<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/style.css">
  <title>Hôtellerie</title>
</head>
<body>
  <header class="bg-secondary p-3 text-center mb-5">
    <div class="text-right"><i class="fa fa-power-off"></i></div>
    <a href="${pageContext.request.contextPath}/Home"><h1>Bienvenue sur notre site</h1></a>
    <nav class="navbar navbar-dark">
      <!-- on teste si la session existe -->

        <a class="text-white" href="?action=deconnexion">Se déconnecter </a>
       <!-- ADMIN & RECEPTIONNISTE -->
        
          <a class="text-white" href="?action=resrvations">Toutes les réservations </a>

          <!-- ADMIN -->
          <a class="text-white" href="?action=ajouter">Ajouter </a>
    

        <a class="text-white" href="?action=connexion">Se connecter </a>

    </nav>
  </header>
  <main class="container-fluid">

  

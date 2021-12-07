<%@ include file="header.jsp" %>

	<h2 class="text-center">Détail chambre ${requestScope.chambre.numChambre}</h2>
	<div> 
		<div><img src="img/chambre.jpg" alt="" /> </div>
		<div>Prix: <c:out value="${requestScope.chambre.prix}"/> </div>
		<div>Lits: <c:out value="${requestScope.chambre.nbreLits}"/> </div>
		<div>Nombre personnes: <c:out value="${requestScope.chambre.nbrePers}"/></div>
		<div>Description: <c:out value="${requestScope.chambre.description}"/></div>
	</div>

<%@ include file="footer.jsp" %>

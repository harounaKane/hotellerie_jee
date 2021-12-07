package forms;

import javax.servlet.http.HttpServletRequest;

import beans.Chambre;

public class Chambre_form {

	private final String CHAMP_PRIX = "prix";
	private final String CHAMP_NBRELITS = "nbreLits";
	private final String CHAMP_NBREPERS = "nbrePers";
	private final String CHAMP_CONFORT = "confort";
	private final String CHAMP_DESCRIPTION = "description";
	
	public Chambre recuperationForm(HttpServletRequest request) {
		Chambre chambre = new Chambre();
		
		chambre.setPrix(Double.valueOf(getChamp(request, CHAMP_PRIX)));
		chambre.setNbreLits(Integer.valueOf(getChamp(request, CHAMP_NBRELITS)));
		chambre.setNbrePers(Integer.valueOf(getChamp(request, CHAMP_NBREPERS)));
		chambre.setConfort(Integer.valueOf(getChamp(request, CHAMP_CONFORT)));
		chambre.setDescription(getChamp(request, CHAMP_DESCRIPTION));
		
		return chambre;
		
	}
	
	public String getChamp(HttpServletRequest request, String champ) {
		return request.getParameter(champ);
	}

}

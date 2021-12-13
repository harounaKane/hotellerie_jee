package forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.Chambre;

public class Chambre_form {

    private final static String CHAMP_PRIX        = "prix";
    private final static String CHAMP_NBRELITS    = "nbreLits";
    private final static String CHAMP_NBREPERS    = "nbrePers";
    private final static String CHAMP_CONFORT     = "confort";
    private final static String CHAMP_DESCRIPTION = "description";
    private static boolean      erreurFormat      = true;

    private Map<String, String> erreurs           = new HashMap<String, String>();

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs( Map<String, String> erreurs ) {
        this.erreurs = erreurs;
    }

    public Chambre recuperationForm( HttpServletRequest request ) {
        Chambre chambre = new Chambre();

        chambre.setPrix( formatValid( getChamp( request, CHAMP_PRIX ), CHAMP_PRIX ) );
        chambre.setNbreLits( (int) formatValid( getChamp( request, CHAMP_NBRELITS ), CHAMP_NBRELITS ) );
        chambre.setNbrePers( (int) formatValid( getChamp( request, CHAMP_NBREPERS ), CHAMP_NBREPERS ) );

        if ( !erreurFormat )
            return null;

        chambre.setConfort( Integer.valueOf( getChamp( request, CHAMP_CONFORT ) ) );
        chambre.setDescription( getChamp( request, CHAMP_DESCRIPTION ) );

        return chambre;
    }

    public double formatValid( String value, String champ ) {
        try {
            double d = Double.valueOf( value );
            if ( d <= 0 ) {
                erreurFormat = false;
                erreurs.put( champ, "Veuillez saisir une valeur positive" );
            }
            return d;
        } catch ( NumberFormatException e ) {
            erreurs.put( champ, "Veuillez saisir une valeur numérique" );
            erreurFormat = false;
        }
        return 0.0;
    }

    public String getChamp( HttpServletRequest request, String champ ) {
        return request.getParameter( champ );
    }

}

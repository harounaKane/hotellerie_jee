package beans;

public class Reserver {

    private Client  client;
    private Chambre chambre;
    private String  dateArrivee;
    private String  dateDepart;

    public Reserver() {
    }

    public Reserver( Client client, Chambre chambre, String dateArrivee, String dateDepart ) {
        super();
        this.client = client;
        this.chambre = chambre;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public Client getClient() {
        return client;
    }

    public void setClient( Client client ) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre( Chambre chambre ) {
        this.chambre = chambre;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee( String dateArrivee ) {
        this.dateArrivee = dateArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart( String dateDepart ) {
        this.dateDepart = dateDepart;
    }

    @Override
    public String toString() {
        return "Reserver [client=" + client + ", chambre=" + chambre + ", dateArrivee=" + dateArrivee + ", dateDepart="
                + dateDepart + "]";
    }

}

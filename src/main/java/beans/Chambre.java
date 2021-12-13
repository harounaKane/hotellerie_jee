package beans;

public class Chambre {

    private int    numChambre;
    private double prix;
    private int    nbreLits;
    private int    nbrePers;
    private int    confort;
    private String description;

    public Chambre() {
    }

    public Chambre( int numChambre, double prix, int nbreLits, int nbrePers, int confort, String description ) {
        super();
        this.numChambre = numChambre;
        this.prix = prix;
        this.nbreLits = nbreLits;
        this.nbrePers = nbrePers;
        this.confort = confort;
        this.description = description;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre( int numChambre ) {
        this.numChambre = numChambre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix( double prix ) {
        this.prix = prix;
    }

    public int getNbreLits() {
        return nbreLits;
    }

    public void setNbreLits( int nbreLits ) {
        this.nbreLits = nbreLits;
    }

    public int getNbrePers() {
        return nbrePers;
    }

    public void setNbrePers( int nbrePers ) {
        this.nbrePers = nbrePers;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort( int confort ) {
        this.confort = confort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Chambre [numChambre=" + numChambre + ", prix=" + prix + ", nbreLits=" + nbreLits + ", nbrePers="
                + nbrePers + ", confort=" + confort + ", description=" + description + "]";
    }

}

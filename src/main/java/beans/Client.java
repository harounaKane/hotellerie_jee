package beans;

public class Client {

    private int    numClient;
    private String nom;
    private String prenom;
    private int    telephone;
    private String adresse;
    private int    code_postal;
    private String ville;

    public Client() {
    }

    public Client( int numClient, String nom, String prenom, int tel, String adresse, int code_postal, String ville ) {
        super();
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = tel;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient( int numClient ) {
        this.numClient = numClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone( int telephone ) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse( String adresse ) {
        this.adresse = adresse;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal( int code_postal ) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille( String ville ) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client [numClient=" + numClient + ", nom=" + nom + ", prenom=" + prenom + ", téléphon=" + telephone
                + ", adresse=" + adresse
                + ", code_postal=" + code_postal + ", ville=" + ville + "]";
    }

}

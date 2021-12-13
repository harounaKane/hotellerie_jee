package beans;

public class Utilisateur {

    private int    id;
    private String login;
    private String pass;
    private String role;

    public Utilisateur() {
    }

    public Utilisateur( int id, String login, String pass, String role ) {
        super();
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass( String pass ) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole( String role ) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", login=" + login + ", pass=" + pass + ", role=" + role + "]";
    }

}

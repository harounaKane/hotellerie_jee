package beans;

import java.util.Date;

public class Reserver {

	private Client client;
	private Chambre chambre;
	private Date dateArrivee;
	private Date dateDepart;
	
	public Reserver() {}

	public Reserver(Client client, Chambre chambre, Date dateArrivee, Date dateDepart) {
		super();
		this.client = client;
		this.chambre = chambre;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "Reserver [client=" + client + ", chambre=" + chambre + ", dateArrivee=" + dateArrivee + ", dateDepart="
				+ dateDepart + "]";
	}
	
	
	
	
}

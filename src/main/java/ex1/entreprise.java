package ex1;

import java.util.Date;

public class Entreprise {

	private int Siret;
	private String Nom;
	private String adresse;
	private Date date_Creation;
	
	public static final int capital_MAX = 3000000;
	
	public Entreprise(int Siret, String Nom, String adresse, Date date_Creation) {
		this.Siret = Siret;
		this.Nom = Nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;	
	}
	
	public void Afficher_Status(){
		System.out.println("Entreprise " + Nom + " à l'adresse " + adresse + "créee le " + date_Creation + "n° de SIRET " + Siret);
	}

	public int getSiret() {
		return Siret;
	}

	public void setSiret(int siret) {
		Siret = siret;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_Creation() {
		return date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}

	public static int getCapitalmax() {
		return capital_MAX;
	}
	
	
}

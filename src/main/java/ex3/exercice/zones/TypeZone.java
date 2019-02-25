package ex3.exercice.zones;

public enum TypeZone {
	ZONE_CARNIVORE("Zone carnivore"),
	AQUARIUM("Aquarium"),
	FERME_REPTILE("Ferme reptile"),
	SAVANE_AFRICAINE("Savane Africaine");
	
	private String nom;
	
	private TypeZone(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}

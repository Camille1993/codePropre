package ex3.exercice;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;

import ex3.exercice.animaux.Animal;

import ex3.exercice.zones.TypeZone;
import ex3.exercice.zones.Zone;
import ex3.exercice.zones.Aquarium;
import ex3.exercice.zones.FermeReptile;
import ex3.exercice.zones.SavaneAfricaine;
import ex3.exercice.zones.ZoneCarnivore;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private EnumMap<TypeZone, Zone> zones = new EnumMap<>(TypeZone.class);

	public Zoo(String nom){
		this.nom = nom;
		zones.put(TypeZone.AQUARIUM, new Aquarium());
		zones.put(TypeZone.FERME_REPTILE, new FermeReptile());
		zones.put(TypeZone.SAVANE_AFRICAINE, new SavaneAfricaine());
		zones.put(TypeZone.ZONE_CARNIVORE, new ZoneCarnivore());

	}

	public void addAnimal(Animal animal){
		if (animal== null) {
			zones.values().stream().forEach(zone -> checkZoneForAnimal(zone, animal));
		}

	}
	private void checkZoneForAnimal(Zone zone, Animal animal){
		if (zone.acceptAnimal(animal)){
			zone.addAnimal(animal);
		}
	}
	public Zone getZoneByType(TypeZone type){
		return zones.get(type);
	}

	public void afficherListeAnimaux(){
		zones.values().stream().forEach(Zone::afficherListeAnimaux);
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int compterAnimaux() {

		int somme = 0;
		for (Zone zone: getZones()){
			somme+=zone.compterAnimaux();
		}
		return somme;
	}
	public Collection<Zone> getZones(){
		return Collections.unmodifiableCollection(zones.values());
	}
}

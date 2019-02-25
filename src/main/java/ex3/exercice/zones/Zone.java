package ex3.exercice.zones;

import java.util.ArrayList;
import java.util.List;

import ex3.exercice.animaux.Animal;

public abstract class Zone {
	
	protected List<Animal> animaux = new ArrayList<Animal>();
	
	public abstract boolean acceptAnimal(Animal animal);
	
	public abstract double getMasse();
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		animaux.stream().forEach(Animal::toString);	
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	
	public double calculerKgsNourritureParJour(){
		return animaux.size()*getMasse();
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	
	
}

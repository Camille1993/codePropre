package ex3.exercice;

import ex3.exercice.animaux.Mammifere;
import ex3.exercice.animaux.Poisson;
import ex3.exercice.animaux.Reptile;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Mammifere("Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Zèbre",Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Lion",Comportement.CARNIVORE));
		zoo.addAnimal(new Mammifere("Panthère",Comportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin blanc",Comportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Truite dorée",Comportement.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor",Comportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Python",Comportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}

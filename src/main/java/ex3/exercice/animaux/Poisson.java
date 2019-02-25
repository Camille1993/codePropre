package ex3.exercice.animaux;

import ex3.exercice.Comportement;
import ex3.exercice.Type;

public class Poisson extends Animal {
	
	public Poisson (String noms, Comportement comportement) {
		super (noms, Type.POISSON, comportement);
	}

}

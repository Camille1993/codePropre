package ex3.exercice.animaux;

import ex3.exercice.Comportement;
import ex3.exercice.Type;

public class Reptile extends Animal{
	public Reptile (String noms, Comportement comportement) {
		super (noms, Type.REPTILE, comportement);
	}

}

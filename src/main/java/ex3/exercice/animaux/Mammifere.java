package ex3.exercice.animaux;

import ex3.exercice.Comportement;
import ex3.exercice.Type;

public class Mammifere extends Animal {
	
	public Mammifere (String nom, Comportement comportement) {
		super(nom,Type.MAMMIFERE, comportement);
	}

}

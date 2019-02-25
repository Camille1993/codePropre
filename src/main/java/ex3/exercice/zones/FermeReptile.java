package ex3.exercice.zones;

import ex3.exercice.Type;
import ex3.exercice.animaux.Animal;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	private static final double MASSE_NOURRITURE = 0.1;

	@Override
	public double getMasse() {
		return MASSE_NOURRITURE;
	}
	@Override
	public boolean acceptAnimal(Animal animal) {
		return animal.getType().equals(Type.REPTILE);
	}

}

package ex3.exercice.zones;


import ex3.exercice.Type;
import ex3.exercice.animaux.Animal;

public class ZoneCarnivore extends Zone{

	private static final double MASSE_NOURRITURE = 10.00;

	@Override
	public double getMasse() {
		return MASSE_NOURRITURE;
	}
	@Override
	public boolean acceptAnimal(Animal animal) {
		return animal.getType().equals(Type.MAMMIFERE);
	}
}

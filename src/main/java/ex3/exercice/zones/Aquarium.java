package ex3.exercice.zones;


import ex3.exercice.Type;
import ex3.exercice.animaux.Animal;

public class Aquarium extends Zone{

	private static final double MASSE_MOYENNE = 0.2;

	@Override
	public double getMasse(){
		return MASSE_MOYENNE;
	}

	@Override
	public boolean acceptAnimal(Animal animal) {
		return animal.getType().equals(Type.POISSON);
	}

	
}

package ex3.exercice.animaux;

import ex3.exercice.Comportement;
import ex3.exercice.Type;

public abstract class Animal {

	protected Type type;
	protected String nom;
	protected Comportement comportement;
	
	public Animal (String nom, Type type, Comportement comportement){
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Comportement getComportement() {
		return comportement;
	}

	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	
	
}

package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
		
	}
	
	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
		}
	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	

}

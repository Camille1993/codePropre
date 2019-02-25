package ex2;

public class CompteCourant extends CompteBancaire {
	private double decouvert;
	
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
		
	}
	
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}
	
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

}

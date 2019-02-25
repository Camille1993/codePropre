package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	protected double solde;
		
	/**
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
		
	/** Ajoute un montant au solde
	 * @param montant
	 */
	
		
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}

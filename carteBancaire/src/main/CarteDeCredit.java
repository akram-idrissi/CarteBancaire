package main;

import java.util.Objects;

public class CarteDeCredit extends CarteBancaire {

	private double limiteCredit;
	private double soldeUtilise;

	public CarteDeCredit(int codeSecurite, boolean active, double plafond, boolean sansContact, double soldeDisponible,
			double limiteCredit, double soldeUtilise) {

		super(codeSecurite, active, plafond, sansContact, soldeDisponible);
		this.limiteCredit = limiteCredit;
		this.soldeUtilise = soldeUtilise;
	}

	public double getLimiteCredit() {
		return limiteCredit;
	}

	public void setLimiteCredit(double limiteCredit) {
		this.limiteCredit = limiteCredit;
	}

	public double getSoldeUtilise() {
		return soldeUtilise;
	}

	public void setSoldeUtilise(double soldeUtilise) {
		this.soldeUtilise = soldeUtilise;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(limiteCredit, soldeUtilise);
		return result;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nLimite du credit: " + limiteCredit + "\nSolde utilisé: " + soldeUtilise + ".";
	}

}

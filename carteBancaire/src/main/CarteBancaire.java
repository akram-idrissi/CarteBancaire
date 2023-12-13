package main;

import java.time.LocalDate;
import java.util.Objects;

public class CarteBancaire implements Comparable<CarteBancaire> {

	public final String numeroCarte = "";
	public final String titulaire = "";
	public final LocalDate dateExpiration = null;
	private int codeSecurite;
	private boolean active;
	private double plafond;
	private boolean sansContact;
	private double soldeDisponible;

	public CarteBancaire(int codeSecurite, boolean active, double plafond, boolean sansContact,
			double soldeDisponible) {
		super();
		this.codeSecurite = codeSecurite;
		this.active = active;
		this.plafond = plafond;
		this.sansContact = sansContact;
		this.soldeDisponible = soldeDisponible;
	}

	public int getCodeSecurite() {
		return codeSecurite;
	}

	public void setCodeSecurite(int codeSecurite) {
		this.codeSecurite = codeSecurite;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	public boolean isSansContact() {
		return sansContact;
	}

	public void setSansContact(boolean sansContact) {
		this.sansContact = sansContact;
	}

	public double getSoldeDisponible() {
		return soldeDisponible;
	}

	public void setSoldeDisponible(double soldeDisponible) {
		this.soldeDisponible = soldeDisponible;
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public String getTitulaire() {
		return titulaire;
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, codeSecurite, dateExpiration, numeroCarte, plafond, sansContact, soldeDisponible,
				titulaire);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarteBancaire other = (CarteBancaire) obj;
		return Objects.equals(numeroCarte, other.numeroCarte);
	}

	@Override
	public String toString() {
		return "Titulaire: " + titulaire + " \nDate expiration: " + dateExpiration + "\nActive: " + active + ".";
	}

	@Override
	public int compareTo(CarteBancaire carte) {
		if (this.numeroCarte.compareTo(carte.numeroCarte) == 0)
			return 0;
		if (this.numeroCarte.compareTo(carte.numeroCarte) == -1)
			return -1;

		return 1;
	}

}

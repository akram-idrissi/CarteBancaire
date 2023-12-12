package main;

import java.time.LocalDate;

public class CarteBancaire {
	
	public final String numeroCarte = "";
    public final String titulaire = "";
    public final LocalDate dateExpiration = null;
    private int codeSecurite;
    private boolean active;
    private double plafond;
    private boolean sansContact;
    private double soldeDisponible;
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
    
    
	
	
	
	

}

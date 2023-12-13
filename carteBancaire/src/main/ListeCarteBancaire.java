package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListeCarteBancaire {
	
	List<CarteBancaire> cartes;
	
	public ListeCarteBancaire(List<CarteBancaire> liste) {
		if (liste == null)
			throw new NullPointerException("La liste ne doit pas etre null");

		if (liste.size() == 0)
			throw new IllegalArgumentException("Le liste ne doit pas etre vide");

		this.cartes = liste;
	}
	
	public void afficher() {
		for(CarteBancaire carte : this.cartes)
			System.out.println(carte.toString());
	}
	
	public void parcourir() {
		Iterator<CarteBancaire> iterateur = this.cartes.iterator();
		while(iterateur.hasNext())
			System.out.println(iterateur.next().toString());
	}
	
	public void ajouter(CarteBancaire element) {
		if (element != null)
			this.cartes.add(element);
		else
			throw new NullPointerException("L'element ne doit pas etre null");
	}
	
	public CarteBancaire recuperer(int indice) {
		if (indice > 0 && indice < this.cartes.size())
			return this.cartes.get(indice);
		else
			throw new ArrayIndexOutOfBoundsException("Indice invalide");
	}
	
	public void supprimer(CarteBancaire element) {
		if(element != null)
			this.cartes.remove(element);
		else
			throw new NullPointerException("L'element ne doit pas etre null");
	}
	
	public boolean rechercher(CarteBancaire element) {
		if(element != null)
			return this.cartes.contains(element);
		else
			throw new NullPointerException("L'element ne doit pas etre null");
	}
	
	public void trier() {
		Collections.sort(this.cartes);
	}
	
	public ArrayList<CarteBancaire> copyDansTableau() {
		ArrayList<CarteBancaire> arrayList = new ArrayList<CarteBancaire>();
		arrayList.addAll(this.cartes);
		return arrayList;
	}
	
	public void melanger() {
		Collections.shuffle(this.cartes);
	}
	
	public void inverser() {
		Collections.reverse(this.cartes);
	}
	
	public List<CarteBancaire> extraire(int debut, int fin) {
		if (debut >= 0 && debut < fin && fin < this.cartes.size())
			return this.cartes.subList(debut, fin);
		else
			throw new NullPointerException("L'element ne doit pas etre null");
	}
	
	public boolean egaliteDeuxListes(List<CarteBancaire> liste) {
		return this.cartes.equals(liste);
	}
	
	public void echanger(int i, int j) {
		Collections.swap(this.cartes, i, j);
	}
	
	public void vider() {
		this.cartes.clear();
	}
	
	public void estVide() {
		this.cartes.isEmpty();
	}
}

package main;

import java.util.Arrays;

class ElementNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(String message) {
		super(message);
	}
}

public class TableauCarteBancaire {

	public CarteBancaire[] cartes;

	public TableauCarteBancaire(CarteBancaire[] tableau) {
		if (tableau == null)
			throw new NullPointerException("Le tableau ne doit pas etre null");

		if (tableau.length == 0)
			throw new IllegalArgumentException("Le tableau ne doit pas etre vide");

		this.cartes = tableau;
	}

	public void trier() {
		Arrays.sort(cartes);
	}

	public void ajouter(CarteBancaire element) {
		int tailleActuelle = this.cartes.length;
		// Creation d'une copie du tableau en incrementant la taille par 1.
		this.cartes = Arrays.copyOf(this.cartes, tailleActuelle + 1);
		this.cartes[this.cartes.length - 1] = element;
	}

	public void supprimer(CarteBancaire element) {
		this.trier();
		int indice = Arrays.binarySearch(this.cartes, element);

		if (indice != -1) {
			int compteur = 0;
			CarteBancaire[] temp = new CarteBancaire[this.cartes.length - 1];
			for (CarteBancaire carte : this.cartes) {
				if (!carte.equals(element)) {
					temp[compteur] = carte;
					compteur++;
				}
			}
			this.cartes = temp;
		} else {
			throw new ElementNotFoundException("La carte a supprimer n'a pas ete trouvée dans le tableau.");
		}

	}

	public int taille() {
		return this.cartes.length;
	}

	public void inverser() {
		CarteBancaire[] temp = new CarteBancaire[this.cartes.length];

		for (int i = this.cartes.length; i >= 1; i--) {
			temp[this.cartes.length - i] = this.cartes[i - 1];
		}

		this.cartes = temp;
	}

	public void afficher() {
		for (CarteBancaire carte : this.cartes)
			System.out.println(carte);
	}

	public double max() {
		double max = this.cartes[0].getSoldeDisponible();
		for (int i = 0; i >= this.cartes.length; i++) {
			if (this.cartes[i].getSoldeDisponible() > max)
				max = this.cartes[i].getSoldeDisponible();
		}
		return max;
	}

	public boolean egaliteDeuxTableaux(CarteBancaire[] tableau1, CarteBancaire[] tableau2) {
		return Arrays.equals(tableau1, tableau2);
	}

}

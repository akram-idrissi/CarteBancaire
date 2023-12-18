package main;

public class Main {

	public static void main(String[] args) {
		
		
		CarteBancaire[] carteBancaireTableau = {
				new CarteBancaire(1, true, 564546, true, 1354654),
				new CarteBancaire(2, true, 564546, true, 1354654),
				new CarteBancaire(3, true, 564546, true, 1354654),
				new CarteBancaire(4, true, 564546, true, 1354654),
				new CarteBancaire(5, true, 564546, true, 1354654),
				new CarteBancaire(6, true, 564546, true, 1354654),
				new CarteBancaire(7, true, 564546, true, 1354654),
				new CarteBancaire(8, true, 564546, true, 1354654),
				new CarteBancaire(9, true, 564546, true, 1354654),
				new CarteBancaire(10, true, 564546, true, 1354654),
		};
		
		
		// ajout
		TableauCarteBancaire tableau = new TableauCarteBancaire(carteBancaireTableau);
		tableau.ajouter(new CarteBancaire(11, true, 564546, true, 1354654));	
		tableau.afficher();
		
		System.out.println("********************************************************************");
		
		// suppression
		tableau.supprimer(new CarteBancaire(10, true, 564546, true, 1354654));
		tableau.afficher();
		
		System.out.println("********************************************************************");

		// taille
		System.out.println(tableau.taille());
		
		System.out.println("********************************************************************");

		// inverser
		tableau.inverser();
		tableau.afficher();
		
		System.out.println("********************************************************************");
		
		// max des soldes
		System.out.println(tableau.max());
		
		System.out.println("********************************************************************");
		
		// egalite deux tableaux
		boolean isEqual = tableau.egaliteDeuxTableaux(carteBancaireTableau, new CarteBancaire[]{new CarteBancaire(1, true, 564546, true, 1354654)});
		System.out.println(isEqual);
		
		boolean isEqual2 = tableau.egaliteDeuxTableaux(carteBancaireTableau, carteBancaireTableau);
		System.out.println(isEqual2);
	}

}

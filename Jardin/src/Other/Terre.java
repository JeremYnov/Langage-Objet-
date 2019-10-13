package Other;

import java.util.Scanner;

public class Terre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quelle longueur fait votre jardin ?");
		Scanner sc = new Scanner(System.in);
		int longueur= sc.nextInt();
		System.out.println("Quelle longueur fait votre jardin ?");
		sc = new Scanner(System.in);
		int largeur = sc.nextInt();
		Jardin j = new Jardin(longueur,largeur);
		j.ajouterPanier("Tomate", 5);
		j.ajouterPanier("Carotte", 5);
		j.ajouterPanier("Ail", 10);
		j.ajouterPanier("Betterave", 5);
		j.toString();
		boolean w = true;
		while(w) {
			System.out.println("\n1. Semer une graine");
			System.out.println("2. Récolter toutes les plantes qui sont matures");
			System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4. Quitter l’application");
			sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1) {
				j.semer();
				j.toString();
			}else if(choice == 2) {
				j.recolter();
				j.toString();
			}else if(choice == 3) {
				j.saisonSuivante();
				j.toString();
			}else if(choice == 4) {
				w = false;
			}else {
				System.out.println("Vous n'avez pas entré un chiffre valide");
			}
		}
		
	}

}

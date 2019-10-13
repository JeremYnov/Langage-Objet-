package Other;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Scanner;

import Flore.Ail;
import Flore.Betterave;
import Flore.Carotte;
import Flore.IOgm;
import Flore.IRacePure;
import Flore.Tomate;

public class Jardin {
	private int largeur;
	private int longueur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;

	public Jardin(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.panier = new HashMap<String, Integer>();
		this.emplacement = new Emplacement[longueur][largeur];
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public Emplacement[][] getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(Emplacement emplacement[][]) {
		this.emplacement = emplacement;
	}

	public HashMap<String, Integer> getPanier() {
		return panier;
	}

	public void ajouterPanier(String vegetalname, Integer vegetalquantity) {
		this.panier.put(vegetalname, vegetalquantity);
	}

	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}

	public void semer() {
		System.out.println("Quelle graine voulez vous planter ?");
		System.out.println("1. Tomate");
		System.out.println("2. Carotte");
		System.out.println("3. Ail");
		System.out.println("4. Betterave");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		System.out.println("A quel emplacement ?");
		int x = scan.nextInt();
		System.out.println("Sur quelle ligne ?");
		int y = scan.nextInt();
		if (choice == 1) {
			this.emplacement[x][y] = new Emplacement(new Tomate());
			this.panier.put("Tomate", panier.get("Tomate") - 1);
			System.out.println("Il vous reste : " + this.panier.put("Tomate", panier.get("Tomate")) + " graine(s)");
		} else if (choice == 2) {
			this.emplacement[x][y] = new Emplacement(new Carotte());
			this.panier.put("Carotte", panier.get("Carotte") - 1);
			System.out.println("Il vous reste : " + this.panier.put("Carotte", panier.get("Carotte")) + " graine(s)");
		} else if (choice == 3) {
			this.emplacement[x][y] = new Emplacement(new Ail());
			this.panier.put("Ail", panier.get("Ail") - 1);
			System.out.println("Il vous reste : " + this.panier.put("Ail", panier.get("Ail")) + " graine(s)");
		} else if (choice == 4) {
			this.emplacement[x][y] = new Emplacement(new Betterave());
			this.panier.put("Betterave", panier.get("Betterave") - 1);
			System.out
					.println("Il vous reste : " + this.panier.put("Betterave", panier.get("Betterave")) + " graine(s)");
		} else {
			System.out.println("Vous n'avez pas entré un chiffre valide");
		}
	}

	public void saisonSuivante() {
		for (int lo = 0; lo < longueur; lo++) {
			for (int la = 0; la < largeur; la++) {
				if (this.emplacement[lo][la] != null) {
					this.emplacement[lo][la].getEmplacement().grandir();
				}
			}
		}
	}

	public void recolter() {
		for (int lo = 0; lo < longueur; lo++) {
			for (int la = 0; la < largeur; la++) {
				if ((this.emplacement[lo][la] != null)
						&& (this.emplacement[lo][la].getEmplacement().getEtat().name() == "FLEUR")) {
					if (emplacement[lo][la].getEmplacement() instanceof IRacePure) {
						IRacePure v = (IRacePure) emplacement[lo][la].getEmplacement();
						v.seReproduire(this.panier);
					}
					if (emplacement[lo][la].getEmplacement() instanceof IOgm) {
						IOgm v = (IOgm) emplacement[lo][la].getEmplacement();
						int x = (int)(Math.random()* longueur);
						int y = (int)(Math.random()* largeur);
						SimpleEntry<Integer, Integer> entry = v.seDupliquer(x, y);
						if(this.emplacement[entry.getKey()][entry.getValue()] == null) {
							this.emplacement[entry.getKey()][entry.getValue()] = new Emplacement(new Betterave());
							this.panier.put("Betterave",panier.get("Betterave")-1);
						}
					}
						this.emplacement[lo][la] = null;
					
				}
			}
		}
	}

	public String toString() {
		System.out.println("Voici notre jardin :");

		for (int lo = 0; lo < longueur; lo++) {
			System.out.println("");
			for (int la = 0; la < largeur; la++) {
				if (this.emplacement[lo][la] == null) {
					System.out.print("o");
				} else {
					System.out.print(emplacement[lo][la].toString());
				}
			}
		}

		System.out.println("\n\nEt notre panier contient :");
		for (String x : panier.keySet()) {
			System.out.println(x + " : " + panier.get(x) + " graine(s)");
		}
		return null;
	}

}

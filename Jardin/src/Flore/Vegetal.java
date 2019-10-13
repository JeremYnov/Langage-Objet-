package Flore;

import Other.Etat;

public abstract class Vegetal {
	private Etat etat;
	private String[][] dessin;

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public String[][] getDessin() {
		return dessin;
	}

	public void setDessin(String[][] dessin) {
		this.dessin = dessin;
	}

	public Vegetal(String enfeuille, String enfleur) {
		// TODO Auto-generated constructor stub
		dessin = new String[7][2];
		dessin[0][0] = "État du végétal";
		dessin[0][1] = "Dessin";
		dessin[1][0] = "En graine";
		dessin[1][1] = "_";
		dessin[2][0] = "En germe";
		dessin[2][1] = ".";
		dessin[3][0] = "En tige";
		dessin[3][1] = "|";
		dessin[4][0] = "En feuille";
		dessin[4][1] = enfeuille;
		dessin[5][0] = "En fleur";
		dessin[5][1] = enfleur;
		dessin[6][0] = "Mort";
		dessin[6][1] = "#";
		this.etat = Etat.GRAINE;
	}

	public void grandir() {
		this.etat = Etat.values()[this.etat.ordinal() + 1]; 
	}
}

package Flore;

import java.util.AbstractMap.SimpleEntry;

public class Betterave extends Vegetal implements IOgm{

	public Betterave() {
		super("b", "B");
		// TODO Auto-generated constructor stub
	}

	@Override
	public SimpleEntry<Integer, Integer> seDupliquer(int longueur, int largeur) {
		SimpleEntry<Integer, Integer> entry = new SimpleEntry<Integer, Integer>(longueur, largeur);
		return entry;
		// TODO Auto-generated method stub
		
	}
}

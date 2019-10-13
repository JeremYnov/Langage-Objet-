package Flore;

import java.util.HashMap;

public class Ail extends Vegetal implements IRacePure{

	public Ail() {
		super("a", "A");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seReproduire(HashMap<String, Integer> panier) {
		// TODO Auto-generated method stub
		panier.put("Ail", panier.get("Ail") + 3); 
	}

}

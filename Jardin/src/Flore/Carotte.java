package Flore;

import java.util.HashMap;

public class Carotte extends Vegetal implements IRacePure{

	public Carotte() {
		super("c", "C");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seReproduire(HashMap<String, Integer> panier) {
		// TODO Auto-generated method stub
		panier.put("Carotte", panier.get("Carotte") + 3); 
	}
}

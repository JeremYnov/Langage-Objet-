package Other;
import Flore.Vegetal;

public class Emplacement {
	
private Vegetal emplacement;

public Emplacement(Vegetal emplacement) {
	this.setEmplacement(emplacement);
}
public Vegetal getEmplacement() {
	return emplacement;
}
public void setEmplacement(Vegetal emplacement) {
	this.emplacement = emplacement;
}
@Override
	public String toString() {
	if(emplacement.getEtat().name()== "GRAINE") {
		return emplacement.getDessin()[1][1];
	}else if(emplacement.getEtat().name()== "GERME") {
		return emplacement.getDessin()[2][1];
	}else if(emplacement.getEtat().name()== "TIGE") {
		return emplacement.getDessin()[3][1];
	}else if(emplacement.getEtat().name()== "FEUILLE") {
		return emplacement.getDessin()[4][1];
	}else if(emplacement.getEtat().name()== "FLEUR") {
		return emplacement.getDessin()[5][1];
	}else if(emplacement.getEtat().name()== "MORT") {
		return emplacement.getDessin()[6][1];
	}
		// TODO Auto-generated method stub
		return null;
	}

}


public class Malus extends Case {

    final int POINTPERDU = -10;
	final int DEPLACEMENT = -2;
	
	public void jouerCase(Joueur j){
		
		j.incrementer(POINTPERDU);
		j.deplacer(getDeplacement());
		
				
	}

	public Boolean isDeplacing() {
		return true;
	}

	public int getDeplacement() {
		return DEPLACEMENT;
	}
}
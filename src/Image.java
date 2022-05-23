import java.util.Random;
import java.util.TreeSet;

public class Image extends Question {


	final static int POINTGAGNE = 10;
	private static TreeSet indice = new TreeSet();

	public void jouerCase(Joueur j) {
		int i, l;
		Random rand = new Random();
		TreeSet nombres = new TreeSet();
		String images[] = new String[4];
		for (i = 1; i < 4; i++) {
			images[i] = "Rami";
		}

		a = rand.nextInt(Partie.TIMAGE);
		if (indice.size() == Partie.TIMAGE) {
			indice.removeAll(indice);
			System.out.println("  Reinitialisation  !!! toute les images on ete vus !");
		}

		while (!indice.add(a)) {
			a = rand.nextInt(Partie.TIMAGE);
		}

		nombres.add(a);
		images[0]=Partie.getImage(a);
		//indice.remove(a);

		for (i = 1; i < 4; i++) {
			l = rand.nextInt(Partie.TIMAGE);
			while (!nombres.add(l)) {
				l = rand.nextInt(Partie.TIMAGE);
			}
			images[i]=Partie.getImage(l);
		}
	}



	public Boolean isDeplacing() {
		if(DEPLACEMENT > 0)return true;
		else return false;
	}

	public int getDeplacement() {
		return DEPLACEMENT;
	}
	public void setDeplacement(int k) {
		DEPLACEMENT = k;
	}
    
}

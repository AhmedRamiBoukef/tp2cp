import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Definition extends Question{

	static final int POINTGAGNE = 10;
	static final int POINTPERDU = -10;
	private static TreeSet indice = new TreeSet();

	public void jouerCase(Joueur j){
		Random rand = new Random();
		String definition="", mot="";
		a = rand.nextInt(Partie.TDEFINITION ) ;
		if(indice.size() == Partie.TDEFINITION) {
			indice.removeAll(indice);
			System.out.println("  Reinitialisation  !!! toute les definitions on ete vus !");
		}
		while(!(indice.add(a)))
			a = rand.nextInt(Partie.TDEFINITION );
		definition = Partie.getDefinition(a,0);
		mot = Partie.getDefinition(a,1);
		System.out.print(definition+": ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(mot);
		if (s.equals(mot)) {
			System.out.println("Gagne");
			j.incrementer(POINTGAGNE);
			j.deplacer(4);
		} else {
			j.incrementer(POINTPERDU);
		}


	}

	public Boolean isDeplacing() {
		if(DEPLACEMENT > 0)return true;
		else return false;
	}

	public int getDeplacement() {
		return DEPLACEMENT;
	}


    
}

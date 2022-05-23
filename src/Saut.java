import java.util.Random;

public class Saut extends Case{

    @Override
    public void jouerCase(Joueur j) {
        j.setPosition(getDeplacement());
    }

    @Override
    public Boolean isDeplacing() {
        return true;
    }

    @Override
    public int getDeplacement() {
        Random rand = new Random();
        int dep = rand.nextInt(99);
        return dep;
    }
}

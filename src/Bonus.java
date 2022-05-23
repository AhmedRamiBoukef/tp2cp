public class Bonus extends Case{
    final int POINTGAGNE = 10;
    final int DEPLACEMENT = 2;


    @Override
    public void jouerCase(Joueur j) {
        j.incrementer(POINTGAGNE);
        j.deplacer(getDeplacement());
    }

    @Override
    public Boolean isDeplacing() {
        return true;
    }

    @Override
    public int getDeplacement() {
        return DEPLACEMENT;
    }
}

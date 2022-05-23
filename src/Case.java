public abstract class Case {
    private int position;
    protected Joueur j;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public abstract void jouerCase(Joueur j);
    public abstract Boolean isDeplacing();
    public abstract int getDeplacement();
}

public class Joueur {
    private String nom;
    private int score;
    private int position;
    private int pion;
    public Joueur(String nom,int i) {
        this.nom = nom;
        this.score = 0;
        this.position = 0;
        setPion(i);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPion() {
        return pion;
    }

    public void setPion(int pion) {
        this.pion = pion;

    }


    public void deplacer(int i){
        this.setPosition(this.getPosition()+i);
    }

    public void incrementer(int i){

        this.setScore(this.getScore() + i);
    }

}
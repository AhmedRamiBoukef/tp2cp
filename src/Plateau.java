import java.util.Random;

public class Plateau {
    private Case[] tab = new Case[100];
    Joueur j;

    public Plateau(Joueur j) {
        this.j = j;
        int nbAlea;
        Random rand = new Random();
        int i;

        tab[0] = new Depart();tab[99] = new Fin();
        tab[0].setPosition(0);tab[99].setPosition(99);
        for( i = 1 ; i < 99 ; i++){
            tab[i]= new Parcours();
            tab[i].setPosition(i);
        }
        i=0;
        while (i<5){
            nbAlea = rand.nextInt(98 - 1 + 1 ) + 1;
            if ((tab[nbAlea]instanceof Parcours)&&(nbAlea!=98)){
                tab[nbAlea]= new Bonus();
                i++;
            }
        }
        i=0;
        while (i<5){
            nbAlea = rand.nextInt(98 - 1 + 1 ) + 1;
            if((tab[nbAlea]instanceof Parcours)&& (nbAlea!=1)){
                if(!(tab[nbAlea-2]instanceof Bonus)){
                    tab[nbAlea]= new Malus();
                    i++;
                }
            }
        }
        i=0;
        while (i<5){
            nbAlea = rand.nextInt(98 - 1 + 1 ) + 1;
            if (tab[nbAlea]instanceof Parcours ){
                tab[nbAlea]= new Saut();
                i++;
            }
        }
        i=0;
        while (i<5){
            nbAlea = rand.nextInt(98 - 1 + 1 ) + 1;
            if((tab[nbAlea]instanceof Parcours )&& (nbAlea!=97)){

                if(nbAlea<95){
                    if(!((tab[nbAlea+2]instanceof Malus )&&(tab[nbAlea+4]instanceof Malus ))){
                        tab[nbAlea]= new Definition();
                        i++;
                    }
                }
                else{
                    tab[nbAlea]= new Definition();
                    i++;
                }
            }}
        i=0;
        while (i<5){
            nbAlea = rand.nextInt(98 - 1 + 1 ) + 1;

            if((tab[nbAlea]instanceof Parcours )&& (nbAlea!=98)){

                if(nbAlea<97){
                    if(!(tab[nbAlea+2]instanceof Malus )){
                        tab[nbAlea]= new Image();
                        i++;
                    }
                }
                else{
                    tab[nbAlea]= new Image();
                    i++;
                }
            }
        }
    }

    public Case[] getCase() {
        return tab;
    }

    public void setCase(Case[] tab) {
        this.tab = tab;
    }
}



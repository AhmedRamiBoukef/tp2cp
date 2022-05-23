import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Partie {
    private Joueur j;
    private Plateau plat;
    private Des d1 = new Des() ;
    private Des d2 = new Des();
    final static int TDEFINITION = 2;
    static int TIMAGE = 100;
    private static ArrayList<String>[] tableDeDefinition = new ArrayList[TDEFINITION];
    private static String[] tableDeDImage = new String[TIMAGE];
    public Partie() {
        j = new Joueur("rami",1);
        plat = new Plateau(j);
        Case[] tab = plat.getCase();
        chargerDef();
        for (int i = 0; i < tab.length ; i++) {
            System.out.print(tab[i].toString());
            System.out.println("    "+i);
        }
        System.out.println(j.getPosition());
    }
    public static String getDefinition(int i, int j ) {
        return tableDeDefinition[i].get(j);
    }

    public static String getImage(int i) {
        return tableDeDImage[i];
    }

    public void chargerDef() {
        for (int i = 0; i < tableDeDefinition.length; i++)
            tableDeDefinition[i] = new ArrayList<String>();
        BufferedReader file = null;
        try {
            String str = null;
            String word;
            int i = 0;
            file = new BufferedReader(new FileReader("def.txt"));
            while (i<tableDeDefinition.length) {
                str = file.readLine();
                StringTokenizer tok = new StringTokenizer(str,"/");
                while (tok.hasMoreTokens()) {
                    word = tok.nextToken();
                    if (word == null)
                        break;
                    tableDeDefinition[i].add(word);
                    if (tok.hasMoreTokens()) {
                        word = (String)tok.nextToken();
                        tableDeDefinition[i].add(word);
                    }
                }
                i++;
            }

        } catch(FileNotFoundException e){e.printStackTrace();}catch(IOException e){e.printStackTrace();
        }finally{
            try{
                if(file != null){
                    file.close();}
            }catch(IOException e){e.printStackTrace();}
        }
        for (ArrayList<String> def:tableDeDefinition) {
            for (String s:def) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println(tableDeDefinition[1].get(0));

        File img = new File("Image");
        int j=0;
        for(File nom : img.listFiles()){
            String name =nom.getName();
            if((name.endsWith(".png"))&&!(name.endsWith("S.png"))){
                StringTokenizer tok = new StringTokenizer(name,".");
                if(tok.hasMoreElements())
                    tableDeDImage[j]=(String)tok.nextElement();
                j++;
            }
        }
        TIMAGE=j;
        //for (String s: tableDeDImage) {
        //    System.out.println(s);
        //}


    }

    public void jouer() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            //int i = d1.Lancer() + d2.Lancer();
            System.out.println(i);
            j.deplacer(i);
            plat.getCase()[j.getPosition()].jouerCase(j);
            System.out.println("pos: "+j.getPosition());

            System.out.println("point: "+j.getScore());
        }
    }

    public void afficher() {
        System.out.println(j.getPosition());
    }

}

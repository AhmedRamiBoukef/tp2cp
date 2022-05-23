import java.util.Random;

public class Des {
    public Des() {
    };
    public int Lancer() {
     Random Ran = new Random() ;
     return Ran.nextInt(6)+1; 
    }
  
}

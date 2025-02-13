
import java.text.MessageFormat;

public class Fusee {
    String nom;
    double poids;
    
    public Fusee(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }    

    public void separationFusée(Fusee fusee) {
        System.out.println(MessageFormat.format("La fusée a séparé son premier étage.", fusee.nom));
    }
}


import java.text.MessageFormat;

public class Arianne6 extends Fusee {
    public Arianne6(String name,double weight) {
        super(name, weight);
    
    }
    public void separationFusée(Fusee fusee) {
        System.out.println(MessageFormat.format("La fusée {0} a séparé son premier étage.", fusee.nom));
    }
}

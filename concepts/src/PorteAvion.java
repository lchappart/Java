
import java.util.ArrayList;

public class PorteAvion {
    public static void decollage(ArrayList<Avion> avions) {
        for (Avion avion : avions) {
            avion.fly();
        }
    }
}


import java.util.ArrayList;

public class Exo5 {
    public static void main(String[] args) {
        PorteAvion pa = new PorteAvion();
        ArrayList<Avion> avions = new ArrayList<Avion>();
        AvionDeChasse adc = new AvionDeChasse();
        AvionBoeing ab = new AvionBoeing();
        Avion a = new Avion();
        avions.add(adc);
        avions.add(ab);
        avions.add(a); 
        pa.decollage(avions);
    }
}

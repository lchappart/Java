public class PorteAvion {
    public static void main(String[] args) {
        Avion a = new Avion();
        AvionDeChasse adc = new AvionDeChasse();
        AvionBoeing ab = new AvionBoeing();
        a.fly();
        adc.fly();
        ab.fly();
    }
}

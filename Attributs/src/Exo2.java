
import java.text.MessageFormat;

public class Exo2 {
    public class Avion {
        private String model;
        private int year;
        private double flightHours;
        
        // Constructeur
        public Avion(String model, int year, double flightHours) {
            this.model = model;
            this.year = year;
            this.flightHours = flightHours;
        }
    }
    public static void main(String[] args) {
        String template = "Model: {0}, Year: {1}, Flight hours: {2}";
        String message;
        Exo2 e = new Exo2();
        Avion a = e.new Avion("Boeing 747", 1969, 100000);     
        message = MessageFormat.format(template, a.model, a.year, a.flightHours);
        System.out.println(message);
    }
    
}

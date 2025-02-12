
import java.text.MessageFormat;

public class Fusee {
    String nom;
    int poids;
    
    public Fusee(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public void lancer() {
        String template = "Fusée {0} créée, Poids : {1} kg.\r\n" + 
                        "La fusée {0} est en phase de lancement.\r\n" + 
                        "La fusée {0} commence son lancement avec une poussée spécifique.\r\n" + 
                        "Les étages de la fusée {0} se séparent après le lancement.\r\n";
        System.out.println(MessageFormat.format(template, nom, poids));
    }
}

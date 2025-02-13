import java.text.MessageFormat;

public class Lanceur {
    public void lancer(Fusee fusee) {
        String template = "Fusée {0} créée, Poids : {1} kg.\r\n" + 
                        "La fusée {0} est en phase de lancement.\r\n" + 
                        "La fusée {0} commence son lancement avec une poussée spécifique.\r\n";
        System.out.println(MessageFormat.format(template, fusee.nom, fusee.poids));
        fusee.separationFusée(fusee);
    }
}

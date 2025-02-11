public class Exo5 {
    public class Voiture {
        private String marque;
        public void buildVoiture(String marque) {
            this.marque = marque;
        }
    }
    public static void main(String[] args) {
        Exo5 e = new Exo5();
        Voiture v = e.new Voiture();
        v.buildVoiture("Peugeot");
        System.out.println(v.marque);
    }
}

public class Cercle extends Forme {
    double rayon;
    public double aire(double rayon, double hauteur) {
        return Math.PI * Math.pow(rayon, 2);
    }
}
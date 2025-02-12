public class Exo3 {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        System.out.println(calculatrice.Calculate("", 1, 2));
        System.out.println(calculatrice.Calculate("-", 1, 2));
        System.out.println(calculatrice.Calculate("/", 1, 2));
        System.out.println(calculatrice.Calculate("*", 1, 2));
    }
}

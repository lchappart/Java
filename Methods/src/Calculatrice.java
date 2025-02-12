public class Calculatrice {
    // private int add(int a, int b) {
    //     return a + b;
    // }

    private double add(double a, double b) {
        return a + b;
    }

    //private int sub(int a, int b) {
    //    return a - b;
    //}

    private double sub(double a, double b) {
        return a - b;
    }

    // private int divid(int a, int b) {
    //     return a / b;
    // }

    private double divid(double a, double b) {
        return a / b;
    }

    // private int multi(int a, int b) {
    //     return a * b;
    // }

    private double multi(double a, double b) {
        return a * b;
    }

    public double Calculate(String operation, double a, double b) {
        switch (operation) {
            case "+":
                return add(a, b);
            case "-":
                return sub(a, b);
            case "/":
                return divid(a, b);
            case "*":
                return multi(a, b);
            case "!":
                System.out.println("Je sais pas encore faire ça !");
                break;
            default:
                System.out.println("L'opération n'est pas valide");
        }
        return 1.2;
    }
}
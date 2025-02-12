public class Compteur {
    public static int count = 0;

    public void increment(int value) {
        count = count + value;
    }

    public void printCount() {
        System.out.println(count);
    }
}

public class Exo1 {
    public static void main(String[] args) {
        Mamals m = new Mamals();
        Birds b = new Birds();
        Reptils r = new Reptils();
        m.move();
        b.move();
        r.move();
        m.walk();
        b.fly();
        r.crawls();
    }
}
public class Exo2 {
    public static void main(String[] args) {
        Car car = new Car("Peugot 206", 350000, "blanche");
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.getColor());
        car.setModel("Peugot 207");
        car.setPrice(400000);
        car.setColor("noire");
        car.printDetails();
    }
}

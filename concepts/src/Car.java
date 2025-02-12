import java.text.MessageFormat;

public class Car {
    private String model;
    private int price;
    private String color;

    public Car(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = Math.max(0, price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails() {
        String template = "Model: {0}, Price: {1}, Color: {2}";
        System.out.println(MessageFormat.format(template, model, price, color));
    }
}

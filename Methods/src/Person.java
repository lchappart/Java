public class Person {
    String name = "John";
    int age = 21;
    String address = "24 rue Jeanne d'Arc";

    public void printName() {
        System.out.println(this.name);
    }

    private void setName(String name) {
        this.name = name;
    }

    protected void printAge() {
        System.out.println(this.age);
    }

    void printAddress() {
        System.out.println(this.address);
    }
}

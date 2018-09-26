
public class Menu {
    private String name;
    private double price;
    private double weight;

    public Menu(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n" + "Menu " + "\n" + "-----" + "\n" + "Name: " + name + "\n" + "Price: " + price + "\n" + "weight: "
                + weight;
    }
}
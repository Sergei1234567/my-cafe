public class MenuItem {
    private String name;
    private double price;
    private double weight;

    public MenuItem(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Menu " + "\n" + "-----" + "\n" + "Name: " + name + "\n" + "Price: " + price + "\n" + "weight: "
                + weight;
    }
}

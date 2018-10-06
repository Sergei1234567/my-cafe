public class MenuItem {

    int number;
    private String name;
    private double price;
    private double weight;

    public MenuItem(int number, String name, double price, double weight) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Menu " + "\n" + "-----" + "\n" + number + ": Name: " + name + "\n" + "Price: " +
                price + "\n" + "weight: " + weight;
    }
}

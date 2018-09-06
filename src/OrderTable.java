public class OrderTable {
    private int tables;
    private int client;
    private int numberOfSeats;

    public OrderTable(int tables, int numberOfSeats) {
        this.tables = tables;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "tables=" + tables +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    public static void main(String[] args) {

    }
}

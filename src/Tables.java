public class Tables {
    private int tables;
    private int numberOfSeats;
    private int client;

    public Tables(int client) {
        this.client = client;
    }

    public Tables(int tables, int numberOfSeats) {
        this.tables = tables;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "tables=" + tables +
                ", numberOfSeats=" + numberOfSeats +
                ", client=" + client +
                '}';
    }
}

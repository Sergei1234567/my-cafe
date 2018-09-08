
public class Table {
    private int id;
    private int seatsCount;
    private boolean free;

    public Table(int id, int seatsCount, boolean free) {
        this.id = id;
        this.seatsCount = seatsCount;
        this.free = free;
    }

    @Override
    public String toString() {
        String isFree = free ? "free" : "booked";
        return "Table " + id + ":" + " seatsCount " + seatsCount + ", " + isFree;
    }
}

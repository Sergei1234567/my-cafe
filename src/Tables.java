
public class Tables {
    private int num;
    public int seats;

    public Tables(int num, int seats) {
        this.seats = seats;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Table" + num + ":" + " seats " + seats;
    }
}

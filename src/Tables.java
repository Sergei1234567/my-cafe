
public class Tables {
    private int num;
    private int seats;

    public Tables( int num, int seats) {
        this.seats = seats;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "num=" + num +
                ", seats=" + seats +
                '}';
    }
}

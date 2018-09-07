import java.util.Arrays;

public class Hall {
    private Tables[] tables;

    public Hall(int count) {
        tables = new Tables[count];
        for (int i = 0; i < count; i++) {
            tables[i] = new Tables();
        }
    }

    @Override
    public String toString() {
        return "Hall{" +
                "tables=" + Arrays.toString(tables) +
                '}';
    }

    public void place(NumberOfSeats seats) {
        for(Tables table : tables){
            NumberOfSeats numberOfSeats = table.getFreeNumberOfSeats();
            if(numberOfSeats == null){
            numberOfSeats.addNumberOfSeats(seats);
            break;
            }

        }
    }
}

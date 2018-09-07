import java.util.Arrays;

public class Hall {
    private Tables[] tables;

    public Hall(int count) {
        tables = new Tables[count];
        for (int index = 0; index < count; index++) {
            this.tables[index] = new Tables(index + 1);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(Tables table : tables){
            result += table.toString() + "\n";
        }
        return result;
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

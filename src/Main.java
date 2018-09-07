
public class Main {
    public static void main(String[] args) {
        CafeSwallow swallow = new CafeSwallow();
        swallow.initMenu();
        Hall hall = new Hall(3);
        NumberOfSeats seats1 = new NumberOfSeats(5);
        NumberOfSeats seats2 = new NumberOfSeats(2);
        NumberOfSeats seats3 = new NumberOfSeats(3);
        hall.place(seats1);
        hall.place(seats2);
        hall.place(seats3);

        System.out.println(hall.toString());
    }
}

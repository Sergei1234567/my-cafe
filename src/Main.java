import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Table> tables = createTables();
        CafeSwallow swallow = new CafeSwallow(tables);
        swallow.printTable();
        bookTable(tables);
    }

    public static void createMenu() {
        Menu menu = new Menu();
        menu.addDish(new Dish("got dog", 11.1, 0.35));
        menu.addDish(new Dish("hamburger", 15.4, 0.50));
        menu.addDish(new Dish("Orange juice", 5.6, 0.25));
    }

    public static List<Table> createTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5, true));
        tables.add(new Table(2, 2, true));
        tables.add(new Table(3, 3, false));
        return tables;
    }

    public static void bookTable(List<Table> tables) {
        Table table = findTableById(tables, tableReservation());
        if (table != null) {
            if (table.isFree()) {
                table.setFree(false);
                System.out.println(table + "\n" + "----------------------------" + "\n" +
                        "The table is free of pleasant rest");
            } else {
                System.out.println(table + "\n" + "----------------------------------------" + "\n" +
                        "Sorry table is busy choose another table:");
            }
        } else {
            System.out.println("There is no stenotic with such a number. Please enter another number");
        }
    }

    public static Table findTableById(List<Table> tables, int number) {
        for (Table table : tables) {
            if (number == table.getId()) {
                return table;
            }
        }
        return null;
    }

    public static int tableReservation() {
        System.out.println("\nFor what table would you sit? Enter the table number:\n" + "----");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        return id;
    }
}







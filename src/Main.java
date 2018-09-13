import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Table> tables = createTables();
        CafeSwallow swallow = new CafeSwallow(tables);
        swallow.printTable();
        bookTable();
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

    public static void bookTable() {
        List<Table> tables = new ArrayList<>();
        System.out.println("For what table would you sit? Enter the table number:");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        for (Table table : tables) {
            if (id == table.getId()) {
                table.isFree();
                System.out.println(table + "The table is free of pleasant rest\n");
            }else {
//                do nothing
            }
        }
    }
}




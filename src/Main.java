import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Table> tables = createTables();
        List<Menu> menuList = createMenu();
        CafeSwallow swallow = new CafeSwallow(tables, menuList);
        swallow.printTable();
        swallow.testMenu();
        bookTable(tables, menuList);
    }

    public static List<Menu> createMenu() {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("got dog", 11.1, 0.35));
        menuList.add(new Menu("hamburger", 15.4, 0.50));
        menuList.add(new Menu("Orange juice", 5.6, 0.25));
        return menuList;
    }

    public static List<Table> createTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5, true));
        tables.add(new Table(2, 2, true));
        tables.add(new Table(3, 3, false));
        return tables;
    }

    public static void bookTable(List<Table> tables, List<Menu> menuList) {
        Table table = findTableById(tables, getUserNumber());
        while (table == null) {
            System.out.println("There is no stenotic with such a number. Please enter another number");
            table = findTableById(tables, getUserNumber());
        }
        if (table != null) {
            if (table.isFree()) {
                table.setFree(false);
                System.out.println(table + "\n" + "----------------------------------" + "\n" +
                        "The table is free of pleasant rest" + "\n" + "----------" + "\n" + menuList);
            } else {
                System.out.println(table + "\n" + "----------------------------------------" + "\n" +
                        "Sorry table is busy choose another table:");
            }
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

    public static int getUserNumber() {
        System.out.println("\nFor what table would you sit? Enter the table number:\n" + "----");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}







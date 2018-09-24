import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Table> tables = createTables();
        List<Menu> menuList = createMenu();
        CafeSwallow swallow = new CafeSwallow(tables, menuList);
        swallow.printTable();
        System.out.println();
        swallow.printMenu();
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
        tables.add(new Table(4, 4, true));
        return tables;
    }

    public static void bookTable(List<Table> tables, List<Menu> menuList) {
        System.out.println("\nFor what table would you sit? Enter the table number:\n" + "----");
        Table table = findTableById(tables, getUserChoice());
        while (table == null) {
            System.out.println("There is no table with such a number. Please enter another number");
            table = findTableById(tables, getUserChoice());
        }

        while (!table.isFree()) {
            System.out.println(table + "\n" + "----------------------------------------" + "\n" +
                    "Sorry table is busy choose another table:");
            table = findTableById(tables, getUserChoice());
        }

        table.setFree(false);
        System.out.println(table + "\n" + "----------------------------------" + "\n" +
                "The table is free of pleasant rest" + "\n" + "----------" + "\n" + menuList);
    }

    public static Table findTableById(List<Table> tables, int number) {
        for (Table table : tables) {
            if (number == table.getId()) {
                return table;
            }
        }
        return null;
    }

    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}







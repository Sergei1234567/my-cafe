import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Table> tables = createTables();
        List<Menu> menu = createMenu();
        CafeSwallow swallow = new CafeSwallow(tables, menu);
        swallow.printTable();
        System.out.println();
        swallow.printMenu();
        swallow.bookTable(tables, menu);
    }

    public static List<Menu> createMenu() {
        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("got dog", 11.1, 0.35));
        menu.add(new Menu("hamburger", 15.4, 0.50));
        menu.add(new Menu("Orange juice", 5.6, 0.25));
        return menu;
    }

    public static List<Table> createTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5, true));
        tables.add(new Table(2, 2, true));
        tables.add(new Table(3, 3, false));
        tables.add(new Table(4, 4, true));
        return tables;
    }
}








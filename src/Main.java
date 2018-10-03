import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Table> tables = createTables();
        List<MenuItem> menu = createMenu();
        CafeSwallow swallow = new CafeSwallow(tables, menu);
        swallow.tablesEndMenu();
    }

    private static List<MenuItem> createMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("got dog", 11.1, 0.35));
        menu.add(new MenuItem("hamburger", 15.4, 0.50));
        menu.add(new MenuItem("Orange juice", 5.6, 0.25));
        return menu;
    }

    private static List<Table> createTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5, true));
        tables.add(new Table(2, 2, true));
        tables.add(new Table(3, 3, false));
        tables.add(new Table(4, 4, true));
        return tables;
    }
}








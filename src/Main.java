import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Table> tables = createTables();
        List<Muniltem> menu = createMenu();
        Tables tables1 = new Tables(tables);
        tables1.printTable();
        Menu menu1 = new Menu(menu);
        menu1.printMenu();
        CafeSwallow swallow = new CafeSwallow();
        swallow.bookTable(tables, menu);
    }

    public static List<Muniltem> createMenu() {
        List<Muniltem> menu = new ArrayList<>();
        menu.add(new Muniltem("got dog", 11.1, 0.35));
        menu.add(new Muniltem("hamburger", 15.4, 0.50));
        menu.add(new Muniltem("Orange juice", 5.6, 0.25));
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








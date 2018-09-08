import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CafeSwallow swallow = new CafeSwallow();
        swallow.printTables();
    }

    public void initMenu() {
        Menu menu = new Menu();
        menu.addDish(new Dish("got dog", 11.1, 0.35));
        menu.addDish(new Dish("hamburger", 15.4, 0.50));
        menu.addDish(new Dish("Orange juice", 5.6, 0.25));
        menu.testMenu();
        System.out.println();
    }

    public void initTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5, true));
        tables.add(new Table(2, 2, true));
        tables.add(new Table(3, 3, false));
    }
}

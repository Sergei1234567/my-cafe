
public class CafeSwallow {
    private Menu menu = new Menu();
    private TesTable test = new TesTable();

    public void initMenu() {
        menu.addDish(new Dish("got dog", 11.1, 0.35));
        menu.addDish(new Dish("hamburger", 15.4, 0.50));
        menu.addDish(new Dish("Orange juice", 5.6, 0.25));
        menu.testMenu();
        System.out.println();
    }

    public void initTables() {
        test.addTables(new Tables(1, 5));
        test.addTables(new Tables(2, 2));
        test.addTables(new Tables(3, 3));
        test.testTables();
    }
}

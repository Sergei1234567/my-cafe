
public class CafeSwallow {
    private Menu menu = new Menu();
    Hall hall = new Hall();

    public void initCafe() {
        menu.addDish(new Dish("got dog", 11.1, 0.35));
        menu.addDish(new Dish("hamburger", 15.4, 0.50));
        menu.addDish(new Dish("Orange juice", 5.6, 0.25));
        menu.testMenu();
    }

    public void initHall() {
        hall.addOrderTable(new OrderTable(1, 4));
        hall.addOrderTable(new OrderTable(2, 4));
        hall.addOrderTable(new OrderTable(3, 4));
        hall.addOrderTable(new OrderTable(4, 4));
        hall.testHall();
    }
}

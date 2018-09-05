
public class CafeSwallow {
    Menu menu = new Menu();

    public void chef() {
        menu.addDish(new Dish("got dog", 11.1, 0.35));
        menu.addDish(new Dish("hamburger", 15.4, 0.50));
        menu.addDish(new Dish("Orange juice", 5.6, 0.25));

        System.out.println("Menu Cafe");
        System.out.println("_________");
    }
}

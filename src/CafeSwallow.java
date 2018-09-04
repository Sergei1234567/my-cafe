import java.util.LinkedList;
import java.util.List;

public class CafeSwallow {
    public static void main(String[] args) {
        Menu menu = new Menu();
        List<Dish> dishes = new LinkedList<>();
        dishes.add(new Dish("got dog", 11.1, 0.35));
        dishes.add(new Dish("hamburger", 15.4, 0.50));
        dishes.add(new Dish("Orange juice", 5.6, 0.25));
        menu.setDishes(dishes);
        System.out.println("Menu Cafe");
        System.out.println("_________");
        System.out.print(menu.getDishes());
    }
}

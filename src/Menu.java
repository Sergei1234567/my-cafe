import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new LinkedList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void testMenu() {
        System.out.println("Menu Cafe: ");
        System.out.println("-----------");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }
}
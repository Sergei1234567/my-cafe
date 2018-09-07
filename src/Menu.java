import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

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
import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new LinkedList<>();

    public void addDish(Dish dish) {
        System.out.println(dish);
        dishes.add(dish);
    }
}
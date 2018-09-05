import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new LinkedList<>();
        CafeSwallow swallow = new CafeSwallow();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
}
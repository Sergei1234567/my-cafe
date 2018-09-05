import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new LinkedList<>();

    public void addDish(Dish dish) {
        System.out.println("Menu Cafe");
        System.out.println("_________");
        System.out.println(dish);
        System.out.println("");
        dishes.add(dish);
    }
}
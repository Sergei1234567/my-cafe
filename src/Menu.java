import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new LinkedList<>();

    public Menu() {
        dishes.add(new Dish("got dog", 11.1, 0.35));
        dishes.add(new Dish("hamburger", 15.4, 0.50));
        dishes.add(new Dish("Orange juice", 5.6, 0.25));
    }


    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

}
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishes = new ArrayList<>();

    public Menu() {
        dishes.add(new Dish("got dog", 11.1, 0.35));
        dishes.add(new Dish("hamburger", 15.4, 0.50));
        dishes.add(new Dish("Orange juice", 5.6, 0.25));
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

}
import java.util.ArrayList;

public class Menu {
    private ArrayList<String> dishes = new ArrayList<>();

    public ArrayList<String> getDishes() {
        dishes.add(0, "hot dog");
        dishes.add(1, "hamburger");
        dishes.add(2, "Orange juice");
        return dishes;
    }

    public void setDishes(ArrayList<String> dishes) {
        this.dishes = dishes;
    }

}
public class CafeSwallow {
    public static void main(String[] args) {
        System.out.println("Menu Cafe");
        Menu menu = new Menu();
        System.out.println(menu.getDishes() + "");
        System.out.println("_________");

        Dish hotDog = new Dish("got dog", 11.1, 0.35);
        System.out.println("Dish n 1:" + "\n" + "name: " + hotDog.getName() + "\n" + "price: "
                + hotDog.getPrice() + "\n" + "weight: " + hotDog.getWeight());
        System.out.println("______");

        Dish hamburger = new Dish("hamburger", 15.4, 0.50);
        System.out.println("Dish n 2:" + "\n" + "name: " + hamburger.getName() + "\n" + "price: "
                + hamburger.getPrice() + "\n" + "weight: " + hamburger.getWeight());
        System.out.println("______");

        Dish orangeJuice = new Dish("Orange juice", 5.6, 0.25);
        System.out.println("Dish n 3:" + "\n" + "name: " + orangeJuice.getName() + "\n" + "price: "
                + orangeJuice.getPrice() + "\n" + "weight: " + orangeJuice.getWeight());
    }
}

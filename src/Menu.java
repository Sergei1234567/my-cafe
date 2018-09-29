import java.util.List;

public class Menu {
    private List<MenuItem> menu;

    public Menu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("\n" + "Menu Cafe:");
        System.out.println("-----------");
        for (MenuItem menu : menu) {
            System.out.println(menu);
        }
    }
}

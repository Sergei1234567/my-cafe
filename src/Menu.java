import java.util.List;

public class Menu {
    private List<Muniltem> menu;

    public Menu(List<Muniltem> menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("\n" + "Menu Cafe:");
        System.out.println("-----------");
        for (Muniltem menu : menu) {
            System.out.println(menu);
        }
    }
}

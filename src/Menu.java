import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> menu;

    public Menu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public MenuItem selectionOfDishes() {
        System.out.println("\nChoose a dish by number." + "\n" + "---");
        MenuItem menus = findMenuById(getUserChoice());
        while (menus == null) {
            System.out.println("There is no such dish.\nChoose a dish by number." + "\n" + "---");
            menus = findMenuById(getUserChoice());
        }
        while (menus != null) {
            System.out.println(menus + "\n" + "Bon Appetit !." + "\n" + "want to order another dish" + "\n" + "----------" +
                    "\n" + "Choose a dish by number." + "\n" + "---");
            menus = findMenuById(getUserChoice());

            while (menus == null) {
                System.out.println("There is no such dish.\nChoose a dish by number." + "\n" + "---");
                menus = findMenuById(getUserChoice());
            }
        }
        return menus;
    }

    public MenuItem findMenuById(int number) {
        for (MenuItem menus : menu) {
            if (number == menus.getNumber()) {
                return menus;
            }
        }
        return null;
    }

    public int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void printMenu() {
        System.out.println("\n" + "Menu Cafe:");
        System.out.println("-----------");
        for (MenuItem menu : menu) {
            System.out.println(menu);
        }
    }
}

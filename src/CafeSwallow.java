import java.util.List;

public class CafeSwallow {
    private List<Table> tables;
    private List<Menu> menu;

    public CafeSwallow(List<Table> tables, List<Menu> menu) {
        this.tables = tables;
        this.menu = menu;
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("-----------");
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    public void printMenu() {
        System.out.println("Menu Cafe: ");
        System.out.println("-----------");
        for (Menu menu : menu) {
            System.out.println(menu);
        }
    }
}


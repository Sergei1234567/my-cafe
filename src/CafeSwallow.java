import java.util.List;

public class CafeSwallow {
    private List<Table> tables;
    private List<Menu> menuList;

    public CafeSwallow(List<Table> tables, List<Menu> menuList) {
        this.tables = tables;
        this.menuList = menuList;
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("-----------");
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    public void testMenu() {
        System.out.println("Menu Cafe: ");
        System.out.println("-----------");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }
}


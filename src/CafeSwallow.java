import java.util.List;

public class CafeSwallow {
    List<Table> tables;
    List<MenuItem> menu;

    public CafeSwallow(List<Table> tables, List<MenuItem> menu) {
        this.tables = tables;
        this.menu = menu;
    }

    public void TableEndMenu() {
        Tables tables1 = new Tables(tables);
        Menu menu1 = new Menu(menu);
        tables1.printTable();
        menu1.printMenu();
        tables1.bookTable();
        menu1.printMenu();
    }
}


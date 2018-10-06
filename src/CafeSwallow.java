import java.util.List;

public class CafeSwallow {

    Tables tables;
    Menu menu;

    public CafeSwallow(List<Table> tables, List<MenuItem> menu) {
        this.tables = new Tables(tables);
        this.menu = new Menu(menu);
    }

    public void printTable() {
        tables.printTable();
    }

    public void printMenu() {
        menu.printMenu();
    }

    public Table bookTable() {
        Table table = tables.bookTable();
        return table;
    }
    public MenuItem selectionOfDishes(){
        MenuItem menus = menu.selectionOfDishes();
        return menus;
    }
}


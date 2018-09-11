import java.util.List;

public class CafeSwallow {
    private List<Table> tables;
    List<Table> tab = getTable();

    private List<Table> getTable() {
        tab.get(1);
        tab.get(2);
        tab.get(3);
        return getTable();
    }

    public CafeSwallow(List<Table> tables) {
        this.tables = tables;
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("-----------");
        for (Table table : tables) {
            System.out.println(table);
        }
    }
}


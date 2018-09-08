import java.util.List;

public class CafeSwallow {
    private List<Table> tables;

    public CafeSwallow(List<Table> tables) {
        this.tables = tables;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("----------\n");
        for (Table table : tables) {
            System.out.println(table);
        }
    }
}


import java.util.List;

public class CafeSwallow {
    private List<Table> tables;
    private List list;

    public CafeSwallow(List<Table> tables, List list) {
        this.tables = tables;
        this.list = list;
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("-----------");
        for (Table table : tables) {
            System.out.println(table);
        }
    }
}


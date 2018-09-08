import java.util.List;

public class CafeSwallow {
    private List<Table> tables;

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


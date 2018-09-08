import java.util.ArrayList;
import java.util.List;

public class CafeSwallow {
    private List<Table> tables = new ArrayList<>();

    public void printTables() {
        System.out.println("Menu cafe");
        System.out.println("----------\n");
        for (Table table : tables) {
            System.out.println(table);
        }
    }
}


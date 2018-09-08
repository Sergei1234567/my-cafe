import java.util.ArrayList;
import java.util.List;

public class TesTable {
    List<Tables> table = new ArrayList<>();

    public void addTables(Tables tables) {
        table.add(tables);
    }

    public void testTables() {
        System.out.println("Столики в кафе: ");
        System.out.println("------------------");
        for (Tables tables : table) {
            System.out.println(tables);
        }
    }
}

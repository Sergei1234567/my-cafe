import java.util.List;
import java.util.Scanner;

public class CafeSwallow {

    public void bookTable(List<Table> tables, List<MenuItem> menu) {
        System.out.println("\nFor what table would you sit? Enter the table number:\n" + "----");
        Table table = findTableById(tables, getUserChoice());

        while (table == null) {
            System.out.println("There is no table with such a number. Please enter another number" + "\n" + "---");
            table = findTableById(tables, getUserChoice());
        }

        while (!table.isFree()) {
            System.out.println(table + "\n" + "----------------------------------------" + "\n" +
                    "Sorry table is busy choose another table:" + "\n" + "---");
            table = findTableById(tables, getUserChoice());
        }

        table.setFree(false);
        System.out.println(table + "\n" + "----------------------------------" + "\n" +
                "The table is free of pleasant rest" + "\n" + "----------" + "\n" + menu);
    }

    public Table findTableById(List<Table> tables, int number) {
        for (Table table : tables) {
            if (number == table.getId()) {
                return table;
            }
        }
        return null;
    }

    public int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}


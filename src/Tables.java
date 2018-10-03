import java.util.List;
import java.util.Scanner;

public class Tables {
    private List<Table> tables;

    public Tables(List<Table> tables) {
        this.tables = tables;
    }

    public Table bookTable() {
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
            while (table == null) {
                System.out.println("There is no table with such a number. Please enter another number" + "\n" + "---");
                table = findTableById(tables, getUserChoice());
            }
        }

        table.setFree(false);
        System.out.println(table + "\n" + "----------------------------------" + "\n" +
                "The table is free of pleasant rest" + "\n" + "----------");
        return table;
    }

    public void printTable() {
        System.out.println("Tables cafe");
        System.out.println("-----------");
        for (Table table : tables) {
            System.out.println(table);
        }
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


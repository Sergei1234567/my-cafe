import java.util.List;
import java.util.Scanner;

public class Tables {
    private List<Table> tables;
    public Tables(List<Table> tables) {
        this.tables = tables;
    }


    public int bookTable(int tableid) {
       Table table = findTableById(tables, getUserChoice());
        System.out.println("\nFor what table would you sit? Enter the table number:\n" + "----");
        while (table == null) {
            System.out.println("There is no table with such a number. Please enter another number" + "\n" + "---");
        }
        while (!table.isFree()) {
            System.out.println(tableid + "\n" + "----------------------------------------" + "\n" +
                    "Sorry table is busy choose another table:" + "\n" + "---");
            while (table == null) {
                System.out.println("There is no table with such a number. Please enter another number" + "\n" + "---");
            }
        }

        table.setFree(false);
        System.out.println(tableid + "\n" + "----------------------------------" + "\n" +
                "The table is free of pleasant rest" + "\n" + "----------" + "\n");
        return tableid;
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


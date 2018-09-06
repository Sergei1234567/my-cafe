import java.util.LinkedList;
import java.util.List;

public class Hall {
    ClientCafe clientCafe = new ClientCafe();
    private List<OrderTable> orderTables = new LinkedList<>();

    public void addOrderTable(OrderTable orderTab) {
        orderTables.add(orderTab);
    }

    public void testHall() {
        System.out.println("");
        System.out.println("Сеолики в кафе: ");
        System.out.println("----------------");
        for (OrderTable orderTab : orderTables) {
            System.out.println(orderTab);
        }
    }
    public void freeTables(){
    }
}

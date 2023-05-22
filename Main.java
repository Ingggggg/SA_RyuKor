import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Order
        System.out.print("Order: ");
        String order = in.nextLine();

        // Detail
        System.out.print("Detail: ");
        String detail = in.nextLine();

        // Create customer
        Customer c1 = new Customer("วีรภัทร สัปปพันธ์", "64050677@kmitl.ac.th");

        // Create store
        Store s1 = new Store("ร้านลุงพจน์", "loongpoj@gmail.com");

        // Order food from store
        c1.orderFood(s1.getName(), order, detail);

        // Create order slip
        OrderSlip orderSlip = s1.createOrderSlip(c1.getCNameAndLastName(), order, detail, 40);

        // Display order details
        System.out.println("\nOrder Slip");
        System.out.println("Customer Name: " + orderSlip.getCName());
        System.out.println("Store Name: " + s1.getName());
        System.out.println("Order: " + orderSlip.getListOrder());
        System.out.println("Detail: " + orderSlip.getDetail());
        System.out.println("Price: " + orderSlip.getPrice() + " บาท");

        // Receive order at store
        s1.receiveOrder(orderSlip.getCName(), orderSlip.getListOrder(), orderSlip.getDetail());

        // Show Queue to Customer
        Queue q1 = s1.showQueue(5, 3, 2);

        // Display queue
        System.out.println("\nQueue");
        System.out.println("Customer queue: " + q1.getCusQ());
        System.out.println("Current queue: " + q1.getNowQ());
        System.out.println("Rest queue: " + q1.getRestQ());

        // Sell food to customer
        s1.saleFood(orderSlip.getCName(), orderSlip.getListOrder());

        // Get circulation of sales at store
        s1.getCirculation(s1.getName(), "List of sales");
        
        in.close();
    }
}

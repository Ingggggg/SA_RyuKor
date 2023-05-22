public class Main {
    public static void main(String[] args) {
        // Create customer
        Customer c1 = new Customer("วีรภัทร สัปปพันธ์", "64050677@kmitl.ac.th");

        // Create store
        Store store = new Store("ร้านลุงพจน์", "loongpoj@gmail.com");

        // Order food from store
        c1.orderFood(store.getName(), "ข้าวกะเพราหมูสับ", "เผ็ดน้อย");

        // Create order slip
        OrderSlip orderSlip = store.createOrderSlip(c1.getCNameAndLastName(), "ข้าวกะเพราหมูสับ", "เผ็ดน้อย");

        // Display order details
        System.out.println("Order Slip");
        System.out.println("Customer Name: " + orderSlip.getCName());
        System.out.println("Order: " + orderSlip.getListOrder());
        System.out.println("Detail: " + orderSlip.getDetail());

        // Receive order at store
        store.receiveOrder(orderSlip.getCName(), orderSlip.getListOrder(), orderSlip.getDetail());

        // Show Queue to Customer
        Queue q1 = store.showQueue(5, 3, 2);

        // Display queue
        System.out.println("Customer queue: " + q1.getCusQ());
        System.out.println("Current queue: " + q1.getNowQ());
        System.out.println("Rest queue: " + q1.getRestQ());

        // Sell food to customer
        store.saleFood(orderSlip.getCName(), orderSlip.getListOrder());

        // Get circulation of sales at store
        store.getCirculation(store.getName(), "List of sales");
    }
}

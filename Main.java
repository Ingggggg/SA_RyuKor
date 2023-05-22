public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "john@example.com");

        // Register the customer
        customer.register("john@example.com", "password123", "John Doe", "1234567890");

        // Login as the customer
        customer.login("john@example.com", "password123");

        // Check customer's login status
        boolean customerLoggedIn = customer.getLoginStatus();
        System.out.println("Customer login status: " + customerLoggedIn);

        // Create a store
        Store store = new Store("Super Mart", "store@example.com");

        // Login as the store
        store.login("store@example.com", "storepassword");

        // Check store's login status
        boolean storeLogedIn = store.getLoginStatus();
        System.out.println("Store login status: " + storeLogedIn);

        // Order food from the store
        customer.orderFood(store.getName(), "Pizza", "double cheese");

        // Create an order slip
        OrderSlip orderSlip = store.orderslip(customer.getCNameAndLastName(), "Pizza", "double cheese");

        // Display order details
        System.out.println("Order Slip:");
        System.out.println("Customer Name: " + orderSlip.getCName());
        System.out.println("Order: " + orderSlip.getListOrder());

        // Receive the order at the store
        store.receiveOrder(orderSlip.getCName(), orderSlip.getListOrder(), orderSlip.getDetail());

        // Sell the food to the customer
        store.saleFood(orderSlip.getCName(), orderSlip.getListOrder());

        // Get the circulation of sales at the store
        store.getCirculation(store.getName(), "List of sales");

        // Get the total queue
        int queue = customer.getQueue(5, 3, 2);
        System.out.println("Total queue: " + queue);
    }
}

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(100);
        c1.setEndTime(150);

        Customer c2 = new Customer(200);
        c2.setEndTime(260);

        System.out.println("Customer " + c1.getId() + " spent " + c1.getTimeSpent() + " time.");
        System.out.println("Customer " + c2.getId() + " spent " + c2.getTimeSpent() + " time.");
    }
}

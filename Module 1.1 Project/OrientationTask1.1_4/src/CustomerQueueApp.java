import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueueApp {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose: [1] Enqueue  [2] Dequeue  [3] Size  [0] Exit");
            String choice = sc.nextLine().trim();

            if ("1".equals(choice)) {
                Customer customer = new Customer(System.nanoTime());
                queue.addFirst(customer);
                System.out.println("Customer with Id " + customer.getId() + " created");
            } else if ("2".equals(choice)) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    System.out.println("Customer " + c.getId() +
                            " spent " + c.getTimeSpent() +
                            " nanoseconds in the queue.");
                }
            } else if ("3".equals(choice)) {
                System.out.println("Queue size: " + queue.size());
            } else if ("0".equals(choice)) {
                System.out.println("Ending");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

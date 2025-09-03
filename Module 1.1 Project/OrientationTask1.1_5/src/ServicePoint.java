import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class ServicePoint {
    private final LinkedList<Customer> queue = new LinkedList<>();

    public void addToQue(Customer customer) {
        queue.addFirst(customer);
    }

    public Customer removeFromQue() {
        if (queue.isEmpty()) return null;
        return queue.removeLast();
    }

    public void serve() {
        while (true) {
            Customer c = removeFromQue();
            if (c == null) break;

            long serviceStart = System.nanoTime();
            long waitingTime = serviceStart - c.getStartTime();

            int serviceMs = ThreadLocalRandom.current().nextInt(50, 201);
            try {
                Thread.sleep(serviceMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            long end = System.nanoTime();
            c.setEndTime(end);

            long serviceTime = end - serviceStart;
            long responseTime = end - c.getStartTime();

            System.out.println("Customer " + c.getId() +
                    " | waiting(ms): " + (waitingTime / 1_000_000) +
                    " | service(ms): " + (serviceTime / 1_000_000) +
                    " | response(ms): " + (responseTime / 1_000_000));
        }
    }

    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();

        for (int i = 0; i < 5; i++) {
            Customer c = new Customer(System.nanoTime());
            sp.addToQue(c);
        }

        sp.serve();
    }
}

public class CustomerGenerator {
    private final ServicePoint sp;
    private final int count;

    public CustomerGenerator(ServicePoint sp, int count) {
        this.sp = sp;
        this.count = count;
    }

    public void generate() {
        for (int i = 0; i < count; i++) {
            Customer c = new Customer(System.nanoTime());
            sp.addToQueueue(c);
        }
    }
}

class Theater {
    private int seatCount;

    public Theater(int seatCount){
        this.seatCount = seatCount;
    }

    public synchronized boolean reserve(String customer, int count){
        if (count <= this.seatCount){
            this.seatCount -= count;
            System.out.printf("%s reserved %d tickets.\n",
                    customer, count);
            return true;
        } else {
            System.out.printf("%s couldn't reserve %d tickets.\n",
                    customer, count);
            return false;
        }
    }
}

public class TaskOne implements Runnable {
    private final Theater theater;
    private final String customerName;
    private final int ticketCount;

    public TaskOne(Theater theater, String customerName, int ticketCount){
        this.theater = theater;
        this.customerName = customerName;
        this.ticketCount = ticketCount;
    }

    @Override
    public void run() {
        theater.reserve(customerName, ticketCount);
    }

    public static void main(String[] args) {
        Theater theater = new Theater(15);

        Thread c1 = new Thread(new TaskOne(theater, "blendi", 4));
        Thread c2 = new Thread(new TaskOne(theater, "matti", 3));
        Thread c3 = new Thread(new TaskOne(theater, "aleksi", 5));
        Thread c4 = new Thread(new TaskOne(theater, "teemu", 2));
        Thread c5 = new Thread(new TaskOne(theater, "juha", 3));
        Thread c6 = new Thread(new TaskOne(theater, "mikael", 5));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
            c6.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Runner extends Thread {
    private final int[] list;
    private final int start;
    private final int end;   // exclusive
    private int sum;

    public Runner(int[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int s = 0;
        for (int i = start; i < end; i++) {
            s += list[i];
            Thread.yield();
        }
        this.sum = s;
    }

    public int returnSum() {
        return this.sum;
    }
}

public class TaskTwo {

    public static void main(String[] args) {
        final int N = 100_000;
        int[] numbers = new int[N];

        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < N; i++) {
            numbers[i] = rand.nextInt(1000); // 0..999
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);

        Runner[] runners = new Runner[cores];
        int chunkSize = N / cores;
        int start = 0;

        for (int i = 0; i < cores; i++) {
            int end = (i == cores - 1) ? N : start + chunkSize;
            runners[i] = new Runner(numbers, start, end);
            start = end;
        }

        long t0 = System.nanoTime();
        for (Runner r : runners) r.start();

        int total = 0;
        for (Runner r : runners) {
            try {
                r.join();
                total += r.returnSum();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        long t1 = System.nanoTime();

        int check = 0;
        for (int v : numbers) check += v;

        System.out.println("Sum      : " + total);

}}

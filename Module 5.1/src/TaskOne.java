class OddGenerator implements Runnable {
    private final int max;

    public OddGenerator(int max){
        this.max = max;
    }


    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2){
            System.out.println("Odd Thread : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenGenerator implements Runnable {
    private final int max;

    public EvenGenerator(int max){
        this.max = max;
    }

    @Override
    public void run(){
        for (int i = 2; i <= 20; i += 2){
            System.out.println("Even Thread : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

public class TaskOne {
    public static void main(String[] args){
        Thread even = new Thread(new EvenGenerator(20));
        Thread odd = new Thread(new OddGenerator(20));

        even.start();
        odd.start();

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Printing complete.");
    }
    }
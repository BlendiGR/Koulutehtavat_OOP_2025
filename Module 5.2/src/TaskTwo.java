import java.util.ArrayList;

class Test {
    private ArrayList<String> testArray = new ArrayList<>();

    public synchronized void addStuff(String stuff) {
        testArray.add(stuff);
        System.out.println("Stuff added to the arraylist");
    }

    public synchronized void removeStuff(String stuff) {
        testArray.remove(stuff);
    }

    public int getSize(){
        return testArray.size();
    }
}

public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {
        Test store = new Test();
        final String TOKEN = "X";

        Thread adder1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    store.addStuff(TOKEN);
                }
            }
        }, "adder-1");

        Thread adder2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    store.addStuff(TOKEN);
                }
            }
        }, "adder-2");

        Thread remover1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    store.removeStuff(TOKEN);
                }
            }
        }, "remover-1");

        Thread remover2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    store.removeStuff(TOKEN);
                }
            }
        }, "remover-2");

        adder1.start();
        adder2.start();
        remover1.start();
        remover2.start();

        adder1.join();
        adder2.join();
        remover1.join();
        remover2.join();

        int finalSize = store.getSize();
        System.out.println("Final size: " + finalSize);
    }
}
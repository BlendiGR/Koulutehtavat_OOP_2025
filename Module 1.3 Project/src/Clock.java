public class Clock {
    private static Clock instance;

    private int time;

    private Clock() {
        time = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(int t) {
        time = t;
    }

    public void tick() {
        time++;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        Clock c1 = Clock.getInstance();
        Clock c2 = Clock.getInstance();


        c1.setTime(10);
        System.out.println("Time after setTime(10): " + c1.getTime());

        c1.tick();
        c1.tick();
        System.out.println("Time after two ticks: " + c1.getTime());

        System.out.println("Time via c2: " + c2.getTime());

        c2.setTime(50);
        System.out.println("Time reset via c2: " + c1.getTime());
    }
}

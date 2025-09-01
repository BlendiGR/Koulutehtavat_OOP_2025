public interface Vehicle {
    default void start(){
        System.out.println("Engine starting...");
    }
    default void stop(){
        System.out.println("Vehicle stopping...");
    }
    String getInfo();
}

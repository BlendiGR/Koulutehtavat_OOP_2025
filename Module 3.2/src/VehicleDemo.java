// VehicleDemo.java
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz", 2005, "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("KTM", 2011, "Gasoline", "Black");
        Bus bus = new Bus("Scania", 2009, "Diesel", 40);

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);

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

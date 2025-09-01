// VehicleDemo.java
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz", 2005, "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("KTM", 2011, "Gasoline", "Black");
        Bus bus = new Bus("Scania", 2009, "Diesel", 40);
        ElectricCar tesla = new ElectricCar(2021, "Tesla", "electric", "Black");

        ElectricMotorcycle husse = new ElectricMotorcycle(2025, "BMW", "electric", "white");


        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.charge();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");

        tesla.start();
        tesla.charge();
        tesla.stop();
        System.out.println(tesla.getInfo() + "\n");

        husse.start();
        husse.charge();
        husse.stop();
        System.out.println(husse.getInfo() + "\n");
    }
}

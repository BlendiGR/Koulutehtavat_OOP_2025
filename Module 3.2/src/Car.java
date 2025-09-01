// Car.java
public class Car extends AbstractVehicle {
    private String fuel;
    private String color;

    public Car(String brand, int year, String fuel, String color) {
        super(brand, year);
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return baseInfo("Car") + "\nFuel: " + fuel + "\nColor: " + color;
    }
}

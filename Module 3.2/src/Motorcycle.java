// Motorcycle.java
public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String brand, int year, String fuel, String color) {
        super(brand, year, fuel);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}

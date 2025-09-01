// AbstractVehicle.java
public abstract class AbstractVehicle implements Vehicle {
    protected String brand;
    protected int year;

    public AbstractVehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println(brand + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " is stopping...");
    }

    protected String baseInfo(String type) {
        return "Type: " + type + "\nBrand: " + brand + "\nYear: " + year;
    }

    @Override
    public abstract String getInfo();
}

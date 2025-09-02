// AbstractVehicle.java
public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String brand;
    protected int year;
    protected String fuel;
    protected double fuelEfficiency;

    public AbstractVehicle(String brand, int year, String fuel) {
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println(brand + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " is stopping...");
    }

    @Override
    public void charge() {
        if ("electric".equalsIgnoreCase(fuel)){
            System.out.println("Charging.....");
        } else System.out.println("Not possible to charge Combustion Engine.");
    }

    protected String baseInfo(String type) {
        return "Type: " + type + "\nBrand: " + brand + "\nYear: " + year;
    }

    @Override
    public abstract String getInfo();

}

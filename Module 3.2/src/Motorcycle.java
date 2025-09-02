public class Motorcycle extends AbstractVehicle {
    private String fuel;
    private String color;

    public Motorcycle(String brand, int year, String fuel, String color,
                      double efficiencyValue, String efficiencyUnit) {
        super(brand, year, efficiencyValue, efficiencyUnit);
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return baseInfo("Motorcycle") + "\nFuel: " + fuel + "\nColor: " + color;
    }
}

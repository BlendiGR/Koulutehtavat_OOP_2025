
public class Bus extends AbstractVehicle {
    private String fuel;
    private int capacity;

    public Bus(String brand, int year, String fuel, int capacity,
               double efficiencyValue, String efficiencyUnit) {
        super(brand, year, efficiencyValue, efficiencyUnit);
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return baseInfo("Bus") + "\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }
}

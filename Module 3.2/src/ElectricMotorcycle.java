public class ElectricMotorcycle extends AbstractVehicle{
    private String color;

    public ElectricMotorcycle(int year, String brand, String fuel, String color){
        super(brand, year, fuel);
        this.color = color;

    }

    @Override
    public String getInfo(){
        return baseInfo("ElectricMotorCycle") + "\nFuel: " + fuel + "\nColor: " + color;
    }
}

public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(int year, String brand, String fuel, String color){
        super(brand, year, fuel);
        this.color = color;

    }

    @Override
    public String getInfo(){
        return baseInfo("ElectricCar") + "\nFuel: " + fuel + "\nColor: " + color;
    }

}

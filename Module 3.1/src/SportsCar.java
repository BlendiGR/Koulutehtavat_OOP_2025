public class SportsCar extends Car{

    public SportsCar(String typeName) {
        super(typeName);
    }
    @Override
    public void accelerate(){
        if (getGasolineLevel() > 0){
            this.speed += 10;
            this.gasolineLevel -= 10;
            System.out.println("Accelerating!");
        } else System.out.println("No Gas.");
    }

}

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 60) {
            myCar.decelerate(10);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.turnOnCruiseControl();

        myCar.setTargetSpeed(230);

        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.turnOnCruiseControl();
        myCar.setTargetSpeed(77);

        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.setTargetSpeed(50);
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");



    }
}
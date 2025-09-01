
public class Car {

    protected double speed;
    protected double gasolineLevel;
    private double tankCapacity;
    private double zeroToHundred;
    private String typeName;
    private boolean cruiseControl = false;
    private int targetSpeed = 0;


    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
    }

    public Car(double tankCapacity, double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
        this.tankCapacity = tankCapacity;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    void turnOnCruiseControl() {
        cruiseControl = !cruiseControl;
        System.out.println("Turning on cruisecontrol");
    }

    void setTargetSpeed(int speedTarget) {
        if (cruiseControl) {
            if (speedTarget < 200 && speedTarget >=50) {
                if (speed > 50 && speed < 200) {
                    targetSpeed = speedTarget;
                    if (targetSpeed > speed) {
                        while (speedTarget - 10 >= speed) {
                            this.accelerate();
                            System.out.println("Accelerating");
                        }
                    } else if (targetSpeed < speed) {
                        while (targetSpeed + 10 <= speed) {
                            this.decelerate(10);
                            System.out.println("Decelerating");
                        }

                    }
                }
            } else {
                cruiseControl = !cruiseControl;
                System.out.println("Speed out of range.");
            }
        }
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }


}
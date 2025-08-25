public class CofffeeMakerDriver {
    public static void main(String[] args){
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.turnOffOn();
        System.out.println("Coffee maker is on");

        myCoffeeMaker.selectType(1);
        System.out.println("Coffee type is " + myCoffeeMaker.coffeeType());

        myCoffeeMaker.setAmount(50);
        System.out.println("Coffee amount is " + myCoffeeMaker.getCoffeeAmount());

        myCoffeeMaker.turnOffOn();
        System.out.println("Coffee maker is off");
    }
}

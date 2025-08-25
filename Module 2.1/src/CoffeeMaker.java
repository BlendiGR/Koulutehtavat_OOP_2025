public class CoffeeMaker {

    private String[] coffeeType = {"normal", "espresso"};
    private int coffeeTypeSelector = 0;
    private boolean on = false;
    private int coffeeAmount = 0;

    public CoffeeMaker (){}

    public void turnOffOn(){
        on = !on;
    }

    public boolean isOn(){
        return on;
    }

    public void selectType(int select){
        if (on){
            if (select <= 1 && select >= 0) {
                coffeeTypeSelector = select;
            }
        }
    }

    public String coffeeType(){
        return coffeeType[coffeeTypeSelector];
    }

    public void setAmount(int amount){
        if (amount >= 10 && amount <= 80 ){
            coffeeAmount = amount;
        }
    }

    public int getCoffeeAmount(){
        return coffeeAmount;
    }
}

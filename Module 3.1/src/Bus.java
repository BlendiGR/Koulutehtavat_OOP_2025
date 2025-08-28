public class Bus extends Car{

    private int passengers;

    public Bus (String typeName){
        super(typeName);
        this.passengers = 0;
    }

    public void passengerEnter(int passengerNumber){
        passengers += passengerNumber;
    }

    public void passengerExit(int passengerNumber){
        passengers -= passengerNumber;
    }
}

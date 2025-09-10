public class Calculator {

    private int value;

    // Constructor: initialize to zero
    public Calculator() {
        this.value = 0;
    }

    // Method 1 reset calculator to zero
    public void reset() {
        this.value = 0;
    }

    // Method 2 add an integer to the calculator
    // ff negative  throw exception
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + number);
        }
        this.value += number;
    }

    // Method 3 Return current value
    public int getValue() {
        return this.value;
    }

    // Temporary main method for testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5);
        calc.add(10);
        System.out.println("Current value: " + calc.getValue()); // 15

        calc.reset();
        System.out.println("After reset: " + calc.getValue()); // 0

        try {
            calc.add(-3); // should throw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

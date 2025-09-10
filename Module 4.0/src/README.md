# Calculator Program

This is a simple calculator program written in Java.  
It is designed as the **Model** in an **MVC pattern**, and it can add positive integers, reset its value, and return the current sum. Negative numbers are not allowed, and trying to add one will throw an exception.

---

## Code

```java
public class Calculator {

    private int value;

    // Constructor: initialize to zero
    public Calculator() {
        this.value = 0;
    }

    // Method 1: Reset calculator to zero
    public void reset() {
        this.value = 0;
    }

    // Method 2: Add an integer to the calculator
    // If negative, throw exception
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + number);
        }
        this.value += number;
    }

    // Method 3: Return current value
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

```

# Explanation

The Calculator class represents a simple calculator that can add 
positive integers. It stores an internal value that starts at zero. 
The reset method sets the value back to zero. The add method adds a 
given integer to the current value. If the integer is negative, 
an IllegalArgumentException is thrown. The getValue method returns 
the current value of the calculator. The main method demonstrates the 
usage of the class by adding numbers, resetting the calculator, 
and handling an exception when trying to add a negative number.
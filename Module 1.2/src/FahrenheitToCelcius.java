import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        double celcius = (temperature - 32) * 5 / 9;
        System.out.printf("In celcius it is %.1f degrees%n", celcius);

    }
}
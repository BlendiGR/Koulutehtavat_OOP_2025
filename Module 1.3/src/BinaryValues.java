import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String number = input.nextLine();

        int valueNow = 0;
        int length = number.length();

        for (int i = 0; i < length; i++) {
            if (number.charAt(i) == '1') {
                valueNow += Math.pow(2, (length - 1 - i));
            }
        }

        System.out.println("Decimal value: " + valueNow);
    }
}

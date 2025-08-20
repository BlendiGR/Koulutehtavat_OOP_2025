import java.util.Scanner;


public class PrimeNumberGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter a larger positive number: ");
        int secondNumber = input.nextInt();

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }
            if (i % 2 == 0 && i != 2) {
                continue;
            }

            boolean isPrime = true;
            for (int d = 3; d <= Math.sqrt(i); d += 2) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }


    }
}

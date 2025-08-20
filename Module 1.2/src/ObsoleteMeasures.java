import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Weight (g): ");
        int grams = input.nextInt();

        double totalLuoti = grams / 13.28;

        int leiviska = (int)(totalLuoti / (20 * 32));
        double remainingAfterLeiviska = totalLuoti % (20 * 32);

        int naula = (int)(remainingAfterLeiviska / 32);
        double luoti = remainingAfterLeiviska % 32;

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);
    }
}

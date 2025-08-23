import java.util.Scanner;

public class FindMaximumSubArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many integers? ");
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer: ");
            arr[i] = in.nextInt();
        }

        int maxSum = arr[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("Maximum sum = " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + " to " + (endIndex + 1));
    }
}

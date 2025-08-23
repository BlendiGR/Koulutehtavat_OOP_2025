import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] initialArray = new int[size];
        int[] uniqueArray = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            initialArray[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int current = initialArray[i];
            boolean exists = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueArray[j] == current) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                uniqueArray[uniqueCount] = current;
                uniqueCount++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}

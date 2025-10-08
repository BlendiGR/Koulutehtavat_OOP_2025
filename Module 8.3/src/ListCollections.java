import java.util.ArrayList;
import java.util.Collections;

public class ListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 5, 8, 20, 15, 3, 12);
        System.out.println("Original shitty list: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After filtering" + numbers);

        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling the odd numbers: " + numbers);

        int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum of the doubled odd numbers: " + sum[0]);

        numbers.sort((a, b) -> b - a);
        System.out.println("Experiment: Sorted in descending order: " + numbers);

    }
}
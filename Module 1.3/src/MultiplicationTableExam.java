import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int points = 0;

        while (points < 10) {
            int number = (int) (Math.random() * 10) + 1;
            int numberTwo = (int) (Math.random() * 10) + 1;

            System.out.println("What is " + number + " x " + numberTwo + "? ");
            int answer = input.nextInt();

            if (answer == number * numberTwo) {
                points++;
                System.out.println("Correct! Points: " + points);
            } else {
                System.out.println("Wrong! The correct answer was " + (number * numberTwo));
            }
        }

        System.out.println("Congratulations! You mastered multiplications!");
    }
}

import java.util.Scanner;


public class NameGen {
    public static void main(String[] args) {

        String[] firstNames = {
                "Liam", "Emma", "Noah", "Olivia", "Ava",
                "Sophia", "James", "Isabella", "Mia", "Ethan"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown", "Jones",
                "Garcia", "Miller", "Davis", "Martinez", "Taylor"
        };

        Scanner input = new Scanner(System.in);
        System.out.print("How many names should we Generate?");
        int num = input.nextInt();

        for (int i = 0; i <= num - 1; i++) {
            int number = (int) (Math.random() * firstNames.length);
            int numberTwo =  (int) (Math.random() * lastNames.length);

            String firstName = firstNames[number];
            String lastName = lastNames[numberTwo];

            System.out.println(firstName + " " + lastName);
        }
    }
}
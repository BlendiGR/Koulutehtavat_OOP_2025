import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of one side of the triangle? ");
        double length = input.nextDouble();

        System.out.print("What is the height of the side of the triangle? ");
        double height = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));

        System.out.printf("The hypotenuse of the triangle is %.1f%n ", hypotenuse);
    }
}

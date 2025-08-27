import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book book1 = new Book("John Smith", 2020, "Introduction to Java Programming");
        Book book2 = new Book("Jane Doe", 2018, "Data Structures and Algorithms");
        Book book3 = new Book("Alice Johnson", 2019, "The Art of Fiction");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        myLibrary.displayBooks();

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter author to search: ");
        String author = input.nextLine().trim();
        if (!author.isEmpty()) {
            myLibrary.findBooksByAuthor(author);
        } else {
            System.out.println("No author entered.");
        }

        System.out.print("\nEnter title to check availability: ");
        String title = input.nextLine().trim();
        if (!title.isEmpty()) {
            if (myLibrary.isBookAvailable(title)) {
                System.out.println("Book is available.");
            } else {
                System.out.println("Book is NOT available.");
            }
        } else {
            System.out.println("No title entered.");
        }

        input.close();
    }
}

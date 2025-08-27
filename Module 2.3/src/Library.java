import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }
    public void addUser(User user) { users.add(user); }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        if (books.isEmpty()) {
            System.out.println("(no books available)");
            return;
        }
        int bookNo = 1;
        for (Book book : books) {
            System.out.println(bookNo + ". Title: \"" + book.getTitle() +
                    "\", Author: \"" + book.getAuthor() +
                    "\", Year: " + book.getYear());
            bookNo++;
        }
    }

    public void findBooksByAuthor(String author) {
        ArrayList<Book> sorted = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                sorted.add(book);
            }
        }
        if (!sorted.isEmpty()) {
            System.out.println("Books by Author \"" + author + "\":");
            for (Book book : sorted) {
                System.out.println("Title: \"" + book.getTitle() +
                        "\", Author: \"" + book.getAuthor() +
                        "\", Year: " + book.getYear());
            }
        } else System.out.println("No books found by author \"" + author + "\".");
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        double countSum = 0;
        int quantity = 0;
        for (Book book : books) {
            for (double rating : book.getRatings()) {
                countSum += rating;
                quantity++;
            }
        }
        if (quantity == 0) return 0.0;
        return countSum / quantity;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }

    // Borrow book by title (tracks user + removes from library)
    public void borrowBook(String title, User user) {
        Book toBorrow = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                toBorrow = book;
                break;
            }
        }
        if (toBorrow != null) {
            user.borrowBook(toBorrow);
            books.remove(toBorrow);
            System.out.println(user.getName() + " borrowed \"" + toBorrow.getTitle() + "\"");
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }

    // Return book by title (adds back to library)
    public void returnBook(String title, User user) {
        Book toReturn = null;
        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                toReturn = book;
                break;
            }
        }
        if (toReturn != null) {
            user.returnBook(toReturn);
            books.add(toReturn);
            System.out.println(user.getName() + " returned \"" + toReturn.getTitle() + "\"");
        } else {
            System.out.println(user.getName() + " does not have \"" + title + "\" borrowed.");
        }
    }

    public void displayBorrowedBooks(User user) {
        System.out.println(user.getName() + " has borrowed:");
        if (user.getBorrowedBooks().isEmpty()) {
            System.out.println("(none)");
            return;
        }
        int i = 1;
        for (Book book : user.getBorrowedBooks()) {
            System.out.println(i + ". \"" + book.getTitle() + "\" by " + book.getAuthor());
            i++;
        }
    }
}

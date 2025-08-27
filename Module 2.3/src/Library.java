import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }
    public void addUser(User user) { users.add(user); }

    public void displayBooks() {
        System.out.println("Library Catalog:");
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
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
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

    public void borrowBook(User user, Book book) {
        if (books.contains(book)) {
            user.borrowBook(book);
            books.remove(book);
        }
    }

    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            books.add(book);
        }
    }
}

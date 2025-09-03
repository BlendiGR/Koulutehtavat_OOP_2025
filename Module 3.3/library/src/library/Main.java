package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "12345");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "67890");

        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member = new LibraryMember("Alice", 1);
        library.addMember(member);

        library.borrowBook(member, book1);
        library.borrowBook(member, book1);
        library.returnBook(member, book1);

        library.listBooks();

        library.reserveBook(member, book1);
        member.showReservations();
        library.cancelBook(member, book1);


    }
}

package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()){
            book.setReserved(true);
            member.reserveBook(book);
            System.out.println(book + " Reserved for member : " + member.getName());
        }
        else System.out.println("Book already reserved.");
    }

    public void cancelBook(LibraryMember member, Book book){
        if (book.isReserved()){
            book.setReserved(false);
            member.cancelReservation(book);
            System.out.println(book + " Reservation cancelled for member : " + member.getName());
        } else System.out.println("Book not reserved.");
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " was not borrowed.");
        }
    }

    public void listBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println(book + (book.isBorrowed() ? " [BORROWED]" : ""));
        }
    }
}

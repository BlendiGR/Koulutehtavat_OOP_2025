package library.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getMemberId() { return memberId; }

    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void reserveBook(Book book){
        reservedBooks.add(book);
    }

    public void cancelReservation(Book book){
        reservedBooks.remove(book);
    }

    public void showReservations(){
        if (reservedBooks.isEmpty()){
            System.out.println("No Reservations");
        } else {
            System.out.println("Reserved books : ");
            for (Book book : reservedBooks){
                System.out.println(book);
            }
        }
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ")";
    }
}

import java.util.ArrayList;

public class Book {
    private String author;
    private int year;
    private String title;
    private ArrayList<Double> ratings = new ArrayList<>();
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String author, int year, String title){
        this.author = author;
        this.year = year;
        this.title = title;
    }


    public int getYear() { return this.year; }

    public String getAuthor() { return this.author; }

    public String getTitle() { return this.title; }

    public void setRating(double rating){
        if (rating >= 1 && rating <= 5){
            ratings.add(rating);
        }
        else System.out.println("Enter a valid rating from 1 - 5!");
    }

    public void addReview(String review){
        reviews.add(review);
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }




}

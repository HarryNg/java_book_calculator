package LibrarySystem;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private LocalDate borrowedAt;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public LocalDate getBorrowedAt() {
        return borrowedAt;
    }

    public String displayBookInfo(){
        return "Book Title: "+ getTitle()
                + "\nAuthor: " + getAuthor()
                + "\nISBN: " + getISBN()
                + "\nBorrowed until date: " + ( borrowedAt != null ? borrowedAt.toString() : "Not borrowed");
    }
    public boolean isAvailable(){
        return !this.isBorrowed;
    }

    public void borrow(){
        if(isAvailable()){
            this.isBorrowed = true;
            this.borrowedAt = LocalDate.now();
        }else {
            System.out.println("You cannot borrow this book. It has been rented out. ");
        }

    }

    public void returnBook(){
        if(isBorrowed){
            this.borrowedAt = null;
            this.isBorrowed = false;
        }else {
            System.out.println("Invalid return. ");
        }
    }
}

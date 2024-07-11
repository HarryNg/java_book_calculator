package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks;
    private boolean isBanned;

    public User(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.isBanned = false;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBan(boolean status){
        if(status != isBanned){
            this.isBanned = status;
        }
    }
    public List<Book> getBookList(){
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
}

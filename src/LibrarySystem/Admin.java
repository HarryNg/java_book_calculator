package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private List<Book> books;
    private List<Book> rentedList;

    public Admin(String name){
        this.name = name;
        this.books = new ArrayList<>();
        this.rentedList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(Book book){
        if(hasBook(book)){
            return book;
        }else {
            return null;
        }
    }

    public boolean hasBook(Book book){
        return books.contains(book);
    }

    public boolean bookIsRented(Book book){
        return rentedList.contains(book);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void ban(User user){
        user.setBan(true);
    }
    public void unBan(User user){
        user.setBan(false);
    }

    public void processBookRent(User user, Book book){
        if(hasBook(book) && book.isAvailable() && !user.isBanned()){
            user.borrowBook(book);
            book.borrow();
            books.remove(book);
            this.rentedList.add(book);
        }else {
            System.out.println("Renting process failed. ");
        }
    }

    public void processBookReturn(User user, Book book){
        if(bookIsRented(book)){
            this.rentedList.remove(book);
            this.books.add(book);
            if(user.isBanned()){
                unBan(user);
            }
        }
    }
}

package LibrarySystem;

import java.util.List;

public class LibrarySystemMain {

    public static void run(){
        Admin admin = new Admin("Hai");
        User userOne = new User("Tom");
        User userTwo = new User("Jerry");
        Book bookOne = new Book("Java for Dummy", "John Doe","AA001");
        Book bookTwo = new Book("On the Origin of Species", "Charles Darwin","CC2002");
        Book bookThree = new Book("The Great Gatsby", "F SCOTT FITZGERALD","SSS3456");
        Book bookFour = new Book("Lord Of The Rings Trilogy", "J.R.R. TOLKIEN","JRR1995");
        admin.addBook(bookOne);
        admin.addBook(bookTwo);
        admin.addBook(bookThree);
        admin.addBook(bookFour);
        List<Book> bookList = admin.getBooks();
        for(Book book : bookList){
            System.out.println(book.displayBookInfo());
        }
    }
}

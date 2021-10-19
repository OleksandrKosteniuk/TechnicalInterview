//        *** PRECONDITIONS ***
//        Create class Book, add fields bookName and bookPrice, constructor, getters
//        Create method to return List<Book> with given quantity of books as parameter
//        bookname should be min 3 max 10 characters randomly
//        bookprice min 1 max 99 randomly
//        *** TASK ***
//        create 10 random books List<Book>
// 
// print all books using method toString
// get List<String> of all book names
// get total price of all books
// get any book with A or a character in name and print its name

// create object Book book1(name myBook, price 5)
// add this book to map Map<Book, String> mapWithBook -> key = Book, value - library name
// create object Book book2(name myBook, price 5)
// get library name using book2 object

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Book {
    private String bookName;
    private int bookPrice;

    public Book(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return bookName == book.bookName;
    }
    
    public static List<Book> getListOfBooks(int quantity) {
        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            listOfBooks.add(new Book(getRandomName(), getRandomPrice()));
        }
        return listOfBooks;
    }
    
    public static int getRandomPrice() {
        int minPrice = 1;
        int maxPrice = 99;
        return minPrice + (int) (Math.random() * ((maxPrice - minPrice) + 1));
    }

    public static String getRandomName() {
        String names[] = {"Max", "Dodo", "Jenna", "Arthur", "Addison", "Benedict", "Alexander", "Evangeline"};
        return names[new Random().nextInt(names.length)];
    }
}
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassForBookVerification {
    public static void main(String[] args) {
        Book book1 = new Book("myBook", 5);
        Book book2 = new Book("myBook", 5);
        
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1,"Library 1");
        mapWithBook.put(book2,"Library 2");

        System.out.println("Book two is in the library: "+mapWithBook.get(book1));
        System.out.println("=============");
        

        List<Book> listOfBooks = Book.getListOfBooks(10);


        listOfBooks.stream().forEach(x -> System.out.println(x.toString()));
        listOfBooks.stream().forEach(x -> System.out.println(x.getBookName()));
        System.out.println("Total price of all books: " + listOfBooks.stream().mapToInt(Book::getBookPrice).sum());
        listOfBooks.stream().filter(x -> x.getBookName().contains("a")).forEach(x -> System.out.println(x.getBookName()));


    }
}

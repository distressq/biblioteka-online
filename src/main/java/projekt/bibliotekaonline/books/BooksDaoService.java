package projekt.bibliotekaonline.books;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BooksDaoService {
    private static List<Book> books = new ArrayList();
    static {
        books.add(new Book(1, "First Book", "First Authoer"));
        books.add(new Book(2, "Second Book", "Second Authoer"));
        books.add(new Book(3, "Third Book", "Third Authoer"));
    }
    public List<Book> findAll(){
       return books;
    }

    public Book findSpecific(int arg){
        return  books.get(arg);
    }
}

package projekt.bibliotekaonline.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksDaoService service;

    @GetMapping("/books")
    public List<Book> retrieveAllBooks(){
        return service.findAll();
    }

    @GetMapping(path = "/books/{id}")
    public Book retrieveSpecificBook(@PathVariable int id){
        return service.findSpecific(id);
    }
}

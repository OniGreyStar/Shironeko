package shiro.neko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import shiro.neko.model.Book;
import shiro.neko.model.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable findAll(){
        return bookRepository.findAll();
    }
    //TODO fix the exceptions or else throw
    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }
    @GetMapping("{id}")
    public Book findOne(@PathVariable Long id) {
        return bookRepository.findById(id)
                .orElseThrow();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book Create(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookRepository.findById(id)
                .orElseThrow();
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id){
        if(book.getId() != id){
        }
        bookRepository.findById(id)
                .orElseThrow();
        return bookRepository.save(book);
    }


}

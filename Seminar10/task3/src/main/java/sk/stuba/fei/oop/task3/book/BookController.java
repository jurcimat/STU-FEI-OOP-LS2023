package sk.stuba.fei.oop.task3.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<BookResponse> getAllBooks() {
        return this.bookService.getAll().stream().map(BookResponse::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable("id") Long id) {
        return new BookResponse(this.bookService.getBookById(id));
    }

    @PostMapping
    public Long createBook(@RequestBody BookRequest request) {
        return this.bookService.createBook(request);
    }

    @PutMapping("/{id}")
    public BookResponse updateBook(@PathVariable("id") Long id, @RequestBody BookRequest request) {
        return new BookResponse(this.bookService.updateBook(id, request));
    }

    @DeleteMapping("/{id}")
    public BookResponse deleteBook(@PathVariable("id") Long id) {
        return new BookResponse(this.bookService.deleteBook(id));
    }

}

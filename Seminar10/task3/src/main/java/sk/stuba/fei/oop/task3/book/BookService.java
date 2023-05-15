package sk.stuba.fei.oop.task3.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book updateBook(Long id, BookRequest request) {
        Book oldBook = this.getBookById(id);
        this.bookRepository.delete(oldBook);
        Book newBook = new Book(id, request.getTitle(), request.getAuthor());
        this.bookRepository.save(newBook);
        return oldBook;
    }

    @Override
    public Long createBook(BookRequest request) {
        Book book = new Book(request);
        this.bookRepository.save(book);
        return book.getId();
    }

    @Override
    public Book deleteBook(Long id) {
        Book book = this.getBookById(id);
        this.bookRepository.delete(book);
        return book;
    }


}

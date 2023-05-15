package sk.stuba.fei.oop.task4.book;

import org.springframework.data.crossstore.ChangeSetPersister;
import sk.stuba.fei.oop.task4.exceptions.NotFoundException;

import java.util.List;

public interface IBookService {

    List<Book> getAll();

    Book getBookById(Long id) throws NotFoundException;

    Book updateBook(Long id, BookRequest request) throws NotFoundException;

    Long createBook(BookRequest request);

    Book deleteBook(Long id) throws NotFoundException;
}

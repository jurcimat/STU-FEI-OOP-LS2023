package sk.stuba.fei.oop.task3.book;

import java.util.List;

public interface IBookService {

    List<Book> getAll();

    Book getBookById(Long id);

    Book updateBook(Long id, BookRequest request);

    Long createBook(BookRequest request);

    Book deleteBook(Long id);
}

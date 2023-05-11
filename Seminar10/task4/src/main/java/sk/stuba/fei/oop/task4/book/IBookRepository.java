package sk.stuba.fei.oop.task4.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book findById(long id);

}

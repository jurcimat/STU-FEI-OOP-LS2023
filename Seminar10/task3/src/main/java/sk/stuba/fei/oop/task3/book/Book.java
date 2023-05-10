package sk.stuba.fei.oop.task3.book;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    public Book(BookRequest request) {
        this();
        this.title = request.getTitle();
        this.author = request.getAuthor();
    }
}

package sk.stuba.fei.oop.task4.book;

import lombok.Getter;

@Getter
public class BookResponse {

    private Long id;
    private String title;
    private String author;

    public BookResponse(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.author = book.getAuthor();
    }
}

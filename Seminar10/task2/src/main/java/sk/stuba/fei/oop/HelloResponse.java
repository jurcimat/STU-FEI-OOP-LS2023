package sk.stuba.fei.oop;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HelloResponse {

    private String message;
    private int count;

    public HelloResponse(String message) {
        this.message = message;
    }

    public HelloResponse(int count, String message) {
        this.count = count;
        this.message = message;
    }

}

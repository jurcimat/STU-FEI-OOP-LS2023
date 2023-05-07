package sk.stuba.fei.oop;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HelloRequestBody {

    private String name;

    public HelloRequestBody(String name) {
        this.name = name;
    }
}

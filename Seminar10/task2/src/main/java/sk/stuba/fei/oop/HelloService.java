package sk.stuba.fei.oop;


import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class HelloService implements IHelloService {
    @Getter
    private int counter;

    public HelloResponse createResponse(HelloRequestBody body) {
        return new HelloResponse(this.counter++, "Hello " + body.getName() + "!");
    }
}

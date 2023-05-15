package sk.stuba.fei.oop.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import sk.stuba.fei.oop.task3.book.*;

@SpringBootApplication
public class Task3Application {

    public static void main(String[] args) {
        SpringApplication.run(Task3Application.class, args);
    }

}

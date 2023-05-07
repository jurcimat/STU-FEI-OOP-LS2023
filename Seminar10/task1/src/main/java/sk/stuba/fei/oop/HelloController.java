package sk.stuba.fei.oop;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/param")
    public String helloParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/path/{name}")
    public String helloPath(@PathVariable(name = "name") String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/request")
    public String helloRequest(@RequestBody HelloRequestBody requestBody) {
        return "Hello " + requestBody.getName() + "!";
    }

}

package sk.stuba.fei.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private IHelloService service;

    @GetMapping("/")
    public HelloResponse greeting() {
        return this.service.createResponse(new HelloRequestBody("World"));
    }

    @GetMapping("/param")
    public HelloResponse helloParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        return this.service.createResponse(new HelloRequestBody(name));
    }

    @GetMapping("/path/{name}")
    public HelloResponse helloPath(@PathVariable(name = "name") String name) {
        return this.service.createResponse(new HelloRequestBody(name));
    }

    @PostMapping("/request")
    public HelloResponse helloRequest(@RequestBody HelloRequestBody requestBody) {
        return this.service.createResponse(requestBody);
    }

}

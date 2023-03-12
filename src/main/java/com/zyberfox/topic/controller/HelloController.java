package topic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record HelloController() {
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hello ";
    }
}

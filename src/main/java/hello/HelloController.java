package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    private final static String greeting ="Greetings from Spring Boot!";
    @RequestMapping("/")
    public String index() {
        return greeting;
    }
    
}

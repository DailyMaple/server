package server.dailymaple.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exampleController {

    @GetMapping("/test")
    public String test(){
        return "hi";
    }
}

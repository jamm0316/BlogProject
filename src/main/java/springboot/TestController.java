package me.evansong.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home() {
        return "home";
    }


    @GetMapping("/test")
    public String test() {
        String str = """
                hello,
                world
                my name
                is
                evan
                """;
        System.out.println(str);
        return str;
    }
}

package my.demos.mapstruct.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class UserController {

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }
}

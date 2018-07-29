package javastar920905.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouzhx  on ${date}
 */
@RestController
public class IndexController {
    @GetMapping("/")
    String home() {
        return "Hello World!";
    }
}

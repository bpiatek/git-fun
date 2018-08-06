package pl.bartaspol.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bartosz Piatek on 06/08/2018
 */
@RestController
public class HomeController {

    @GetMapping("/{name}")
    public String home(@PathVariable String name) {
        return "Witaj " + name;
    }
}

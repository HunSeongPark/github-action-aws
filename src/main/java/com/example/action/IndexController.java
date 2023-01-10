package com.example.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Hunseong-Park
 * @date : 2023-01-10
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "ver 6";
    }
}

package com.example.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Hunseong-Park
 * @date : 2023-01-10
 */
@RestController
@PropertySource("classpath:application.properties")
public class IndexController {

    @Value("${my.name}")
    private String myName2;




    @GetMapping("/")
    public String index() {
        return myName2;
    }
}

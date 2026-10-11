package com.aakash.welcomerestcontroller.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(@RequestParam("name")  String name , @RequestParam("age") int age ) {

        String welcome =  "Hello mister " + name + " Welcome!!!  to the Rest Controller" +" Your age is " + age;
        return new ResponseEntity<>(welcome, HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String greeting(){
        return " Greetings User !!! Welcome to  Rest Controller";
    }

}

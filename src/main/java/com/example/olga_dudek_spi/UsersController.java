package com.example.olga_dudek_spi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping()
    public String getUsers() {
        return "HTTP GET request zostala wyslana";
    }

    @PostMapping()
    public String gcreateUsers() {
        return "HTTP POST request zostala wyslana";
    }
}

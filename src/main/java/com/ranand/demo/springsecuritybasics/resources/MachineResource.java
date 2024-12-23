package com.ranand.demo.springsecuritybasics.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Ramesh Anand
 */
@RestController
@RequestMapping("/machine")
public class MachineResource {
    @GetMapping("getId")
    public String getUserById() {
        return UUID.randomUUID().toString();
    }
}

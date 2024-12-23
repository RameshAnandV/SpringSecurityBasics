package com.ranand.demo.springsecuritybasics.resources;


import com.ranand.demo.springsecuritybasics.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh Anand
 */

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return new User("ranand", 5);
    }

    @PostMapping("addUser")
    public User getUserById(@RequestBody User user) {
        return user;
    }
}

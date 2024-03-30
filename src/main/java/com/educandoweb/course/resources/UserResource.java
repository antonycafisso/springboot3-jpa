package com.educandoweb.course.resources;

import com.educandoweb.course.entites.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Maria","maria@gmail.com","12345678","54321");
        return ResponseEntity.ok().body(user);
    }
}

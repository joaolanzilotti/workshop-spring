package com.corporation.workshopmongo.resources;

import com.corporation.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping
    public ResponseEntity<List<User>> findAll(){
        User user = new User("1", "João", "teste@gmail.com");
        User user2 = new User("2", "Pedro", "teste@gmail.com");
        List<User> listaUser = new ArrayList<>();
        listaUser.addAll(Arrays.asList(user, user2));
        return ResponseEntity.ok().body(listaUser);
    }

}

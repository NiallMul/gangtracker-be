package ie.julianstownlodge.necromundaxpcounterbe.controllers;

import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import ie.julianstownlodge.necromundaxpcounterbe.model.UserProfile;
import ie.julianstownlodge.necromundaxpcounterbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/getUser")
    public UserProfile getUser(@RequestBody String id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "/saveUser")
    public void saveList(@RequestBody UserProfile userProfile) {
        userService.createUser(userProfile);
    }
}

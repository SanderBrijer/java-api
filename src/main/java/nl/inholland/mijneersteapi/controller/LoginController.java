package nl.inholland.mijneersteapi.controller;

import nl.inholland.mijneersteapi.model.dto.LoginDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login");
    public String login(@RequestBody LoginDTO login){
        return userService.login(login.getUsername(), login.getPassword()));
    }


}

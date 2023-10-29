package com.bcm.businesscarmanagementapi.controller;

import com.bcm.businesscarmanagementapi.entity.Users;
import com.bcm.businesscarmanagementapi.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class LoginController {

    private final UsersRepository usersRepository ;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Users user){
        Users savedUser = null;
        ResponseEntity response = null;
        try{
            String hashPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashPassword);
            savedUser = usersRepository.save(user);
            if(savedUser.getId() != null){
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully register");
            }
        }catch (Exception ex){
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("An exception occured due to" + ex.getMessage());
                    .body("An exception occured due to");
        }
        return response;
    }

    @GetMapping("/user")
    public Optional<Users> getUserDetailsAfterLogin(Authentication authentication){
        Optional<Users> user = usersRepository.findByEmail(authentication.getName());
        if(user!=null){
            return user;
        }
        return null;
    }

}
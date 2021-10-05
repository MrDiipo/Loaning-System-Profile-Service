package com.mrdiipo.loaning_system_profile_service.application;

import com.mrdiipo.loaning_system_profile_service.domain.model.User;
import com.mrdiipo.loaning_system_profile_service.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/profile")
public class ProfileController {

    private final UserRepository userRepository;

    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public void newUser(@RequestBody final User user){
        userRepository.save(user);
    }

    @PutMapping("/user")
        public void updateUser(@RequestBody final User user){
            userRepository.save(user);

    }
}

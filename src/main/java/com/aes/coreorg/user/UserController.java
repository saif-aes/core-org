package com.aes.coreorg.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/users")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        return ok(userService.create(userDTO));
    }

    @PutMapping(value = "/users/{userId}")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long userId) {
        return ok(userService.update(userDTO, userId));
    }

    @GetMapping(value = "/users/{userId}")
    public ResponseEntity<?> getUser(@PathVariable Long userId) {
        return ok(userService.read(userId));
    }
}

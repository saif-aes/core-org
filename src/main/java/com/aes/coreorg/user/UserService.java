package com.aes.coreorg.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(UserDTO userDTO) {
        return userRepository.save(UserDTO.getUserEntity(userDTO));
    }

    public User update(UserDTO userDTO, Long userId) {
        User existingUser = userRepository.findById(userId).orElse(null);
        User updatedUser = UserDTO.updateEntityFromDTO(existingUser, userDTO);
        return userRepository.save(updatedUser);
    }

    public User read(Long userId) {

        return userRepository.findById(userId).orElse(null);
    }
}

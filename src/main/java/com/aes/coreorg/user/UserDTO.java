package com.aes.coreorg.user;

import lombok.Data;

@Data
public class UserDTO {

    private String emailAddress;

    private String username;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    public static User getUserEntity(UserDTO userDTO) {
        User user = new User();
        user.setEmailAddress(userDTO.getEmailAddress());
        user.setUsername(userDTO.getUsername());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        return user;
    }

    public static UserDTO getUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmailAddress(user.getEmailAddress());
        userDTO.setUsername(user.getUsername());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        return userDTO;
    }

    public static User updateEntityFromDTO(User user, UserDTO userDTO) {
        user.setEmailAddress(userDTO.getEmailAddress());
        user.setUsername(userDTO.getUsername());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        return user;
    }
}

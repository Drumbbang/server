package com.drumbbang.user.service;

import com.drumbbang.user.dto.UserDto;
import com.drumbbang.user.entity.User;
import com.drumbbang.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserDto addUser (UserDto userDto) {
        User addUser = User.builder()
                .name(userDto.getName())
                .mobileNum(userDto.getMobileNum())
                .activated(false)
                .build();

        User result = userRepository.save(addUser);
        return UserDto.builder()
                .name(result.getName())
                .uniqueNum(result.getUniqueNum())
                .mobileNum(result.getMobileNum())
                .activated(result.getActivated())
                .createdDate(result.getCreatedDate())
                .build();
    }
}

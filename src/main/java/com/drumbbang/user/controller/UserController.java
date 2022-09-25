package com.drumbbang.user.controller;

import com.drumbbang.user.dto.UserDto;
import com.drumbbang.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/member")
    public ResponseEntity<UserDto> join (@RequestBody UserDto userJoinRequestDto) {
        return ResponseEntity.ok(userService.addUser(userJoinRequestDto));
    }
}

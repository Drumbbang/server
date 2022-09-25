package com.drumbbang.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UserDto {
    private Long uniqueNum;

    private String mobileNum;

    private Boolean activated;

    private String name;

    private String password;

    private LocalDateTime createdDate;
}

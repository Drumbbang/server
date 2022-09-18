package com.drumbbang.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name="user")
public class User {
    @Id
    @Column(name="user_unique_num")
    private Long uniqueNum;

    private String mobileNum;

    private Boolean activated;

    @Column(name="user_name")
    private String name;

    @Column(name="user_password" +
            "")
    private String password;

    @CreatedDate
    private LocalDateTime createdDate;
}

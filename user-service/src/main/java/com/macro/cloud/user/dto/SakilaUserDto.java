package com.macro.cloud.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SakilaUserDto implements Serializable {

        private Integer id;

        private String name;

        private String nickname;

        private String emailAddress;

        private Long phone;
}

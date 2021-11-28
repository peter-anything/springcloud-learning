package com.macro.cloud.user.service;

import com.macro.cloud.user.dto.SakilaUserDto;

import java.util.List;

public interface SakilaUserService {
    List<SakilaUserDto> selectAll();
}

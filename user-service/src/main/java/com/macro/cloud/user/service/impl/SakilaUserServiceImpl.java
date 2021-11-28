package com.macro.cloud.user.service.impl;

import com.macro.cloud.user.domain.SakilaUser;
import com.macro.cloud.user.dto.SakilaUserDto;
import com.macro.cloud.user.mapper.SakilaUserMapper;
import com.macro.cloud.user.service.SakilaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SakilaUserServiceImpl implements SakilaUserService {
    @Autowired
    SakilaUserMapper sakilaUserMapper;

    @Override
    public List<SakilaUserDto> selectAll() {
        List<SakilaUserDto> sakilaUsers = new ArrayList<>();
        List<SakilaUser> users = sakilaUserMapper.selectAll();
        for (SakilaUser user: users) {
            SakilaUserDto sakilaUserDto = new SakilaUserDto();
            sakilaUserDto.setId(user.getId());
            sakilaUserDto.setName(user.getName());
            sakilaUserDto.setEmailAddress(user.getEmailAddress());
            sakilaUserDto.setNickname(user.getNickname());
            sakilaUserDto.setPhone(user.getPhone());
            sakilaUsers.add(sakilaUserDto);
        }
        return sakilaUsers;
    }
}

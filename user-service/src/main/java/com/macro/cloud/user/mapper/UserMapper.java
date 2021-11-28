package com.macro.cloud.user.mapper;

import com.macro.cloud.user.domain.SakilaUser;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SakilaUser record);

    int insertSelective(SakilaUser record);

    SakilaUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SakilaUser record);

    int updateByPrimaryKey(SakilaUser record);

    List<SakilaUser> selectAll();

    void sayHello();
}

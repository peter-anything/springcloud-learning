package com.macro.cloud.user.controller;

import com.macro.cloud.user.domain.CommonResult;
import com.macro.cloud.user.dto.SakilaUserDto;
import com.macro.cloud.user.service.SakilaUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by macro on 2019/8/29.
 */
@RestController
@RequestMapping("/sakilauser")
public class SakilaUserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SakilaUserService sakilaUserService;

    @GetMapping("/all")
    public CommonResult<List<SakilaUserDto>> getAllUser() {
        List<SakilaUserDto> users = sakilaUserService.selectAll();
        return new CommonResult<>(users);
    }
}

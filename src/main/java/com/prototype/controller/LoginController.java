package com.prototype.controller;

import com.google.gson.Gson;
import com.prototype.dao.UserDao;
import com.prototype.model.dto.UserDto;
import com.prototype.model.entity.Audience;
import com.prototype.model.entity.User;
import com.prototype.util.GsonUtil;
import com.prototype.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;


public class LoginController {

    @Autowired
    private UserDao dao;

    @Autowired
    private Audience audience;

    @PostMapping("login")
    public String login(@Validated UserDto user) {
        String result_str = "";
        User u = dao.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        if (u != null) {
            String jwtToken = JwtHelper.createJWT(u.getUserName(),
                    u.getId(),
                    null,
                    audience.getClientId(),
                    audience.getName(),
                    audience.getExpiresSecond()*1000,
                    audience.getBase64Secret());
            result_str = "bearer;" + jwtToken;
        } else {
            result_str = "用户名或密码错误";
        }
        return GsonUtil.build(result_str);
    }
}

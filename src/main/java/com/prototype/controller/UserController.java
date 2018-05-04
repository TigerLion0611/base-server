package com.prototype.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.prototype.dao.UserDao;
import com.prototype.model.entity.User;
import com.prototype.model.dto.UserDto;
import com.prototype.util.GsonUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
    private UserDao userDao;

	@PostMapping(value="/login")
    @ResponseBody
	public String login(@Validated @RequestBody UserDto dto) {
		logger.info("info:"+dto.getUserName()+","+dto.getUserName());
		logger.warn("warn:"+dto.getUserName()+","+dto.getPassword());
		logger.error("error:"+dto.getUserName()+","+dto.getPassword());
		User user = userDao.findByUserName(dto.getUserName());
		return GsonUtil.build(user);
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable String id) {
		return id;
	}

	@GetMapping(value="/crash")
    @ResponseBody
	public String crash(@RequestParam String name) {
		System.out.println(1/0);
		return GsonUtil.build();
    }
	
	@GetMapping(value="/validation")
    @ResponseBody
	public String validation(@NotEmpty(message="用户名不能为空") @RequestParam String name,
			@NotEmpty(message="密码不能为空") @RequestParam String password) {		
		return GsonUtil.build();
    }
}

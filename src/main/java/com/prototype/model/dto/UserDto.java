package com.prototype.model.dto;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {

	private String id;
	@Required
	@NotNull(message = "用户名不能为空")
    @Size(min=6, max=16, message = "用户名长度必须在6和16之间")
	private String userName;
	@Required
	@NotNull(message = "密码不能为空")
    @Size(min=6, max=16, message = "密码长度必须在6和16之间")
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

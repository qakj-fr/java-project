package com.qakj.crm.service;

import com.qakj.crm.pojo.User;

public interface UserService {
	//通过用户名和密码查询user
	User getUserByUsernameAndPassword(String username,String password);
	//通过id修改密码
	void updateUserById(Integer id,String password);

}

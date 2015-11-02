package com.brotherarm.server.demo.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherarm.server.demo.dao.mybatis.IUserMybatisDao;
import com.brotherarm.server.demo.domain.mybatis.User;

@Service
public class UserService {
	@Autowired
	private IUserMybatisDao useDao;
	
	public void addUser(User user) throws Exception{
		useDao.addUser(user);
		//throw new Exception();//打开,测试事务回滚
	}
}

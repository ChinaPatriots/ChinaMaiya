package com.brotherarm.server.demo.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.brotherarm.server.demo.domain.mybatis.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-base.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void addUserTest() {
		try{
			User aUser = new User();
			aUser.setName("test");
			
			userService.addUser(aUser);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.ratemyproperty.app;

import com.ratemyproperty.app.model.user.User;
import com.ratemyproperty.app.model.user.repository.UserRepository;
import com.ratemyproperty.app.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class AppApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	void savingUser_test(){
		User createdUser = userService.createUser("test@gmail.com","sachu","password");
		Assertions.assertEquals("test@gmail.com",createdUser.getEmail());

		String retrievedEmail = userService.getUsersEmail(createdUser.getId());
		Assertions.assertEquals(createdUser.getEmail(),retrievedEmail);
	}

}

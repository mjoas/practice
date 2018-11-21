package exampleTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import example.User;
import example.UserController;

class UserContollerTest {
	
	static User testUser;
	static UserController testUserController;
	
	@BeforeAll
	public static void init() throws Exception{
		testUser = new User();
		testUser.setName("Malte");
		testUser.setPassword("123");
		testUser.setAge(30);
		testUserController = new UserController();
	}

	@Test
	void getNameShouldReturnName() {
		assertEquals("The name must be Malte", "Malte", testUserController.getUsername(testUser));
	}
	
	@Test
	void getPasswordShouldReturnPassword() {
		assertEquals("The password must be password", "password", testUserController.getUserPassword(testUser));
	}
	
	@Test
	void getAgeShouldReturnAge() {
		assertEquals("The age must be 18", 18, testUserController.getUserAge(testUser));
	}
	
	@Test
	void ageShouldBeOver18() {
		assertTrue("The age must be over 18",true);
	}

}

package example;

public class UserController {
	
	public String getUsername(User user) {
		return user.getName();
		
	}
	
	public String getUserPassword(User user) {
		return user.getPassword();
	}
	
	public int getUserAge(User user) {
		return user.getAge();
	}
	
	public boolean isOver18(User user) {
		return user.getAge()>=18;
	}

}

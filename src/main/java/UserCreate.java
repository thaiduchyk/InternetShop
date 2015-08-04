import entity.User;


public class UserCreate {
private String firstName;
private String lastName;
	public User createUser(String firstName, String lastName){
		User user = new User();
		user.setUserName(firstName);
		user.setUserSurName(lastName);
		return user;
	}

}

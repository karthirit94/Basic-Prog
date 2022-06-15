package builder;

public class UserDetails {
	
	private int userId;
	private String userName;
	private String country;
	
	public UserDetails setUserId(int userId) {
		this.userId = userId;
		return this;
	}
	
	public UserDetails setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	
	public UserDetails setCountry(String country) {
		this.country = country;
		return this;
	}
	
	public User getUser() {
		return new User(userId,userName,country);
	}


}

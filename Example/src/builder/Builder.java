package builder;

public class Builder {

	public static void main(String[] args) {
			
		User u1 = new UserDetails().setUserId(1).setUserName("Karthik").setCountry("India").getUser();
		User u2 = new UserDetails().setUserId(2).setUserName("Prem").setCountry("US").getUser();
		System.out.println(u1.toString());
		System.out.println(u2.toString());
	}

}

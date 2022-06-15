package immutable;

public class LoginSmallInfo {

	private String token;
	private String serveLocation;
	
	public LoginSmallInfo(String token, String serveLocation) {
		super();
		this.token = token;
		this.serveLocation = serveLocation;
	}

	public String getToken() {
		return token;
	}

	public String getServeLocation() {
		return serveLocation;
	}

	@Override
	public String toString() {
		return "LoginSmallInfo [token=" + token + ", serveLocation=" + serveLocation + "]";
	}
	
	@Override
	public int hashCode() {
		char[] data = token.toCharArray();
		int hashCode = 0;
		for(char result : data) {
			hashCode+=((int) result % data.length);
		}
		return hashCode;
	}
	
}

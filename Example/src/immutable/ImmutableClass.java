package immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
	
	private final String userName;
	private final String password;
	private final List<LoginSmallInfo> info;
	
	public ImmutableClass(String userName, String password, List<LoginSmallInfo> info) {
		super();
		this.userName = userName;
		this.password = password;
		List<LoginSmallInfo> temp = new ArrayList<LoginSmallInfo>();
//		for(LoginSmallInfo data : info) {
//			temp.add(data);
//		}
//		info.forEach((data) -> {
//			this.info.add(data);
//		});
		info.forEach(temp :: add);
//		this.info = info.stream().map(data -> data).collect(Collectors.toList());
		this.info = temp;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public List<LoginSmallInfo> getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "ImmutableClass [userName=" + userName + ", password=" + password + ", info=" + info + "]";
	}
	
	
	
}

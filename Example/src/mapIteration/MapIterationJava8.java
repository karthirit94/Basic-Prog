package mapIteration;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class MapIterationJava8 {

	public static void main(String[] args) {
		
		System.out.println("List iteration ");
		List<User> userDetails = new ArrayList<>();
		User u1 = new User(1,"Karthik","India");
		User u2 = new User(2,"Prem","England");
		User u3 = new User(3,"Prabhu","India");
		User u4 = new User(4,"Maha","India");
		User u5 = new User(5,"Srija","America");
		User u6 = new User(6,"Karthik","America");
		User u7 = new User(7,"Maha","England");
		userDetails.add(u1);
		userDetails.add(u2);
		userDetails.add(u3);
		userDetails.add(u4);
		userDetails.add(u5);
		userDetails.add(u6);
		userDetails.add(u7);
		System.out.println("List Size : "+ userDetails.size());
		for(User u: userDetails) {
			System.out.println(u.toString());
		}
		System.out.println("GroupBy location ");
		
//		userDetails.stream().collect(Collectors.groupingBy(null));
		
//		userDetails.stream().collect(Collectors.groupingBy(data -> data.getLocation()));
		Map<String, List<User>> userGroupByLocation = userDetails.stream().collect(Collectors.groupingBy(data -> {
			return data.getLocation();
		}));
		
		System.out.println("GroupBy location Size : " + userGroupByLocation.size());
		
//		for (Iterator iterator = userDetails.iterator(); iterator.hasNext();) {
//			User user = (User) iterator.next();
//			
//		}
		
//		for (Map.Entry<String, List<User>> entry : userGroupByLocation.entrySet()) {
//			String key = entry.getKey();
//			List<User> val = entry.getValue();
//			System.out.println("Key : " + key + " Value : " + val);
//		}
				
		userGroupByLocation.forEach((String key,List<User> value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
			
		Map<Sam, List<User>> userMapSam = userDetails.stream().collect(Collectors.groupingBy(data -> new Sam(data.getUserName(),data.getLocation())));
		
		System.out.println("GroupBy Sam Size : " + userMapSam.size());
		
		userMapSam.forEach((Sam key, List<User> value) -> {
			System.out.println("Key : " + key.toString() + " Value : " + value);
		});
		
		Map<String, Map<String, List<User>>> userGroupByGroupMap = userDetails.stream().collect(Collectors.groupingBy(data -> data.getUserName(),Collectors.groupingBy(data -> data.getLocation())));
		System.out.println("GroupBy GroupBy Size : " + userGroupByGroupMap.size());
//		userDetails.stream().collect(Collectors.groupingBy(Collectors.groupingBy(data -> new ImmutablePair(data.getUserName(),data.getLocation()))));
		
		userGroupByGroupMap.forEach((String userName, Map<String, List<User>> valueMap) -> {
			System.out.println("GroupBy Key 1 : "+ userName);
			for(Map.Entry<String, List<User>> data: valueMap.entrySet()) {
				System.out.println("GroupBy Key 2 : "+ data.getKey() + " Values : "+ data.getValue());
			}
		});

		Map<String, String> userNameAndLocationMap = userDetails.stream().collect(Collectors.groupingBy(Data -> Data.getUserName(),Collectors.mapping(data->data.getLocation(),Collectors.joining(","))));
		System.out.println("userName And Location Map Size : " + userNameAndLocationMap.size());
		userNameAndLocationMap.forEach((String key, String value) -> {
			System.out.println("Key : "+ key + " and " +  "Value : "+ value);
		});
		
//		Map<BlogPostType, String> postsPerType = posts.stream()
//				  .collect(groupingBy(BlogPost::getType, 
//				  mapping(BlogPost::getTitle, joining(", ", "Post titles: [", "]"))));
		
//		userDetails.stream().collect(groupingBy(data -> data.getUserName(),mapping(data -> data.getLocation(),joining(" Country"))));
		
//		userDetails.stream().collect(Collectors.groupingBy(data -> data.getUserName(),mapping(data -> data.getUserName(),)));
		
//		System.out.println("Map Iteration test :");
//		for(Iterator ite = userGroupByLocation.entrySet().iterator(); ite.hasNext();) {
//			HashMap<String,List<String>> data = (HashMap<String,List<String>>) ite.next();
//			data.forEach((String key, List<String> value )->{
//				System.out.println("Key : " + key.toString() + " Value : " + value);
//			});
//		}
	}
}

class User{
	private int userId;
	private String userName;
	private String location;
	public User(int userId, String userName, String location) {
		this.userId = userId;
		this.userName = userName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", location=" + location + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
		
}

class Sam{
	private String userName;
	private String location;
	public Sam(String userName, String location) {
		super();
		this.userName = userName;
		this.location = location;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}

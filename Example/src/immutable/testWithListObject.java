package immutable;

import java.util.ArrayList;
import java.util.List;

public class testWithListObject {

	public static void main(String[] args) {
		List<LoginSmallInfo> data = new ArrayList<LoginSmallInfo>();
		data.add(new LoginSmallInfo("1234", "London"));
		data.add(new LoginSmallInfo("1954", "Chennai"));
		String name = "karthik";
		String password = "Srija";
		ImmutableClass obj = new ImmutableClass(name, password, data);
		System.out.println("Name : " + name + " & " + "Password : " + password);
		System.out.println("Name : " + obj.getUserName() + " & " + "Password : " + obj.getPassword());
		name = "David";password="Maha";
		System.out.println("Name : " + name + " & " + "Password : " + password);
		System.out.println("Name : " + obj.getUserName() + " & " + "Password : " + obj.getPassword());
		System.out.println("Data Info List : ");
		for(LoginSmallInfo login: data) {
			System.out.println(login.toString());
		}
		System.out.println("Object Data Info List : ");
		for(LoginSmallInfo login: obj.getInfo()) {
			System.out.println(login.toString());
		}
//		List<LoginSmallInfo> objData = obj.getInfo();
		data.add(new LoginSmallInfo("2014", "Singapore"));
		System.out.println("Data Info List After list update: ");
		for(LoginSmallInfo login: data) {
			System.out.println(login.toString());
		}
		System.out.println("Object Data Info List size check again :  " + data.size());
	}
}

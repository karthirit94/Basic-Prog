package mapIteration;

import java.util.HashMap;
import java.util.Map;

public class mapsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> e = new HashMap<String, String>();
		e.put("a", "aa");
		e.put("b", "bb");
		e.put("c", "cc");
		e.put("d", "dd");
		System.out.println(e.size());
		e.merge("e", "ee" , (a,b)->  a+b);
		System.out.println(e.size());
		e.forEach((String key, String value)->{
			System.out.println("Key : "+ key + " & " + "Value : "+ value);
		});
		e.replace("c", "cc", "cccccc");
		System.out.println("C details " + e.get("c"));
		e.remove("a");
		System.out.println(e.size());
	}

}

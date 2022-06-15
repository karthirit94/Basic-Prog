package exception;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "karthik");
		Employee e2 = new Employee(1, "karthik");
		Set<Employee> data = new HashSet<Employee>();
		data.add(e1);
		data.add(e2);
		System.out.println(data.size());
//		int[] num = {2,3,2,3,4,3,4};
//		int[] num = {2,3,4,4,4,4,3,2,4,3};
//		int oddMaximum = 1;
//		int result = 0;
//		Map<Integer,Integer> dataMap = new LinkedHashMap<>();
//		for(Integer data: num) {
//			int count = 1;
//			if(dataMap.containsKey(data)) {
//				count = dataMap.get(data);
//				count++;
//				if(count%2!=0 && oddMaximum < count) {
//					oddMaximum = count;
//					result = data;
//				}
//			}
//			dataMap.put(data, count);
//		}
//		System.out.println(result);
	};

}

class Employee{
	private int id;
	private String name;
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

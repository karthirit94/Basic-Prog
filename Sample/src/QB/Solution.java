package QB;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Mani","Dev");
		Emp e2 = new Emp(2,"Karthik","QA");
		Emp e3 = new Emp(5,"Mani","Manager");
		Emp e4 = new Emp(3,"suresh","Dev");
		Emp e5 = new Emp(4,"Surya","QA");
		
//		System.out.println(e1.hashCode());
//		System.out.println(e3.hashCode());
		
		
		
		
		Set<Emp> data = new HashSet<Emp>();
		data.add(e1);
		data.add(e2);
		data.add(e3);
		data.add(e4);
		data.add(e5);
		
		
		Map<String, List<Emp>> groupByDes = data.stream().collect(Collectors.groupingBy(a -> a.getDesingnation()));
		
		for(Map.Entry<String, List<Emp>> entry : groupByDes.entrySet()) {
			System.out.println("Designation : " + entry.getKey() + " Count : " +  entry.getValue().size());
		}
		
		//select * from emp;
		
		//select count(*) from Emp GroupBy desingnation
		
		
		
//		
//		for(Emp e: data) {
//			System.out.println(e.getId());
//		}
		
	}

}

class Emp{
	private int id;
	private String name;
	private String desingnation;
	
	
	
	public Emp(int id, String name, String desingnation) {
		super();
		this.id = id;
		this.name = name;
		this.desingnation = desingnation;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesingnation() {
		return desingnation;
	}



	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}



	@Override
	public int hashCode() {
		return id;
	}
	
}


package sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;

public class qqq {

	public qqq() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> a = Stream.of("one", "two", "three", "four")
//	              .filter(e -> e.length() > 3)
//	             .peek(e -> System.out.println("Filtered value: " + e))
//	             .map(String::toUpperCase)
//	             .peek(e -> System.out.println("Mapped value: " + e))
//	             .collect(Collectors.toList());

		// 
//		 List<String> q = Stream.of("one", "two", "three", "four")
//		.filter(e -> {
//			System.out.println("length : " + e.length());
//			return e.length() > 3; })
//		.map(e -> {
//			System.out.println(e);
//			return e.toUpperCase();
//		}).collect(Collectors.toList());	
		 
		// comparator
//		 List<eee> comp = new ArrayList<>();
//		 comp.add(new eee(29,1994,"Samath"));
//		 comp.add(new eee(29,1994,"Ajay"));
//		 comp.add(new eee(29,1995,"Deva"));
//		 comp.add(new eee(02,1991,"Prem"));
//		 
//		 List<eee> v = comp.stream().sorted(Comparator.comparing(eee::getAge).thenComparing(e -> e.getYear()).thenComparing(eee::getName).reversed())
//		 .collect(Collectors.toList());
//		 
//		 for(eee a: v) {
//			 System.out.println(a.getName());
//		 }
		 

	}

}


class eee{

	private int age;
	private int year;
	private String name;
	
	public eee(int age, int year, String name) {
		this.age = age;
		this.year = year;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
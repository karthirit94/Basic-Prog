package enums;

public class TestEnum {
	
	public static void main(String[] args) {
		String date = "12-12-2022";
//		Object e = Month.valueOf(Month.class, 03);
		Month value = Month.value(12);
		System.out.println(value.name());
		Calender e = Calender.valueOf("WEEK");
		System.out.println(e.name());
		String test = Month.AUG.test();
		System.out.println(test);
	}
	
}

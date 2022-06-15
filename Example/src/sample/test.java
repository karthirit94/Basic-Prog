package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		List<String> a = Arrays.asList("b","y","q","a","c");
		Collections.sort(a);
		List<String> r = Arrays.asList("b","y","q","a","c");
		ArrayList<String> e = new ArrayList<String>(Arrays.asList("b","y","q","a","c"));
		ArrayList<String> b = new ArrayList<String>(a);
//		Arrays.sort(a);
	}
}

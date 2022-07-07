package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		
		
		
		Map<String,String> dataMap = new HashMap<String, String>();
		
		dataMap.put("Karthikeyan", "KT"); //Index 4 
		dataMap.put("Sheik", "SK"); // Index 7
		dataMap.put("Karthikeyan", "KTM"); //Index 4 
		dataMap.put("Gowtham", "DET"); // Index 4 ->-> 777 karthikeyan,KTM -> 555 Gowtham,DET
		dataMap.put("Gowtham", "DPT"); // Index 4 ->-> karthikeyan,KTM -> Gowtham,DET
//		falloadFactor = 0.75;
		
		
		
		
		String a = "karthikeyan";
		String b = "thikeyankar";
		int length = a.length();
		 char[] aArray = a.toCharArray();
		 boolean result = false;
			 for(int i=0;i<length;i++) {
				 if(a.equals(b)) {
					 result = true;
					 i++;
					 System.out.println("Count : " + i);
					 break;
				 }else {
					 a = left(a.toCharArray(),length);
					 System.out.println("a: " + a);
				 }
			 }
		System.out.println("Result: " + result);
	}

	private static String left(char[] aArray,int length) {
//		String result = "";
		char[] newChar = new char[length];
		char initialElement = aArray[0];
		for(int i=1;i<length;i++) {
			newChar[i-1] = aArray[i];
		}
		newChar[length -1] = initialElement;
		return new String(newChar); 
	}
}

package prob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		
		
		int[] A = {51,71,17,42};
		int[] B = {42,33,60};
		int size = A.length;
		
//		int[] sum = new int[size];
		List<Integer> sum = new ArrayList<>();
//		int index = 0;
		for(int data: A) {
			String dataToString = String.valueOf(data);
			char[] dataChar = dataToString.toCharArray();
			int count = 0;
			for(char Char: dataChar) {
				count+= Integer.valueOf(String.valueOf(Char));
			}
			sum.add(count);
			count = 0;
//			index++;
		}
		
//		for(int S: sum) {
//			System.out.println(S);
//		}
		
		HashSet<Integer> distinct = new HashSet<Integer>(sum);
		
		if(distinct.size() == sum.size()) {
//			return -1;
			System.out.println("-1");
		}else {
			
//		int reuslt = distinct.stream().mapToInt(data -> {
//			return sum.stream().filter(info -> info == data).mapToInt(info -> {
//				info}).sum();
//		}).max().getAsInt();
//				IntStream.range(0, sum.size()).filter(info -> info == data).map(null)
			LinkedHashMap<Integer, Integer> combinationMap = new LinkedHashMap<Integer, Integer>();
			for(Integer data:distinct) {
				int count = 0;
				if(combinationMap.containsKey(data)) {
					count = combinationMap.get(data);
				}
				combinationMap.put(data,count++);
			}
			
			List<Integer> sums = new LinkedList<Integer>();
//			combinationMap.forEach((Integer K, Integer V) -> {
//				if(V == 1) {
//				)
//				}
//			});
			
			int result = distinct.stream().mapToInt(data -> {
				int count = 0;
				for(int i=0;i<sum.size();i++) {
					if(data == sum.get(i)) {
						count += A[i];
					}
				}
				return count;
			}).max().getAsInt();
			
//			return result;
		System.out.println(result);
		
		
		
		distinct.stream().mapToInt(data -> {
			int count = -1;
			for(int i=0;i<sum.size();i++) {
				if(data == sum.get(i)) {
					return A[i];
				}
			}
			return count;
		}).collect(null, null, null);
		
//		distinct.forEach(data -> {
//			sum.stream().filter(info -> info == data).mapToInt(info -> info).sum();
//		});
		}
		
//		sum.stream().distinct().map(data -> {
//	
//		}).
		
		
//		String S = "50552";
//		int length = S.length();
//		List<Integer> data = new ArrayList<Integer>();
//		for(int i=0;i<length && i+1 != length;i++) {
//				String consistent = String.valueOf(S.charAt(i)) + String.valueOf(S.charAt(i+1));
//				data.add(Integer.valueOf(consistent));
//		}
//		data.stream().mapToInt(info -> info).max().getAsInt();
//		System.out.println(data.stream().mapToInt(info -> info).max().getAsInt());
		
		
		
//		String s = "minusplusminus";
//		int length = s.length();
//		char[]  dataChar = s.toCharArray();
//		int index = 0;
//		String result = "";
//
//	for(char data: dataChar) {
//		if(index<length) {
//			if(data == 'm') {
//				index += 5;
//				result += "-";
//			}else if(data == 'p') {
//				index += 4;
//				result += "+";
//			}
//		}
//	}
//	
//	System.out.println(result);
		
	}

}

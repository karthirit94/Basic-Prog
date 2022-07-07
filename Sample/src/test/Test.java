package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] m = {1,1,3,3,4,4,4,5,5,6,6,6,6,6,6};

		
//		int[] m = {1,2,3,4,4,4,4,5,5};
		int n = 2; 
		// max = 6, 2ndMax = 3 , 3+3 =6 
		// hammer on one nail any number of time
		
		// Need to sort to find Max and Min Value
		Arrays.sort(m);
		int min = m[0];
//		while() {
			for(int i= m.length -1 ; i > 0 && n > 0; i--) {
				int data = m[i];
				if(min != data) 
				m[i] = data - 1; 
				n--; 
			}
//		}
		
//		int count = 1;
//		for(int i=1;i<m.length;i++) {
//			if(min == m[i])
//			count++;
//		}
		
		Map<Integer,Integer> dataMap = new HashMap<Integer,Integer>();
		for(int i=0;i<m.length;i++) {
			int count = 1;
			if(dataMap.containsKey(m[i])) {
				count = dataMap.get(m[i]) + 1;
			}
			dataMap.put(m[i], count);
		}
		
//		List<Collection<Integer>> result = Arrays.asList(dataMap.values());
		AtomicInteger result = new AtomicInteger(0);
		dataMap.forEach((Integer Key,Integer Value) -> {
			if(Value > result.get())
				result.set(Value);
		});
		
//		int MaximumNUmber = Stream.of(dataMap.values()).mapToInt(data -> data).max().getAsInt();
		System.out.println(result.get());
		System.out.println("Input :  ");
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i] + ",");
		}

	}

}

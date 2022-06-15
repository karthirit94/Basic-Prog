package sample;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class aaaa {

	public static void main(String[] args) {
		
		Scanner getInpput = new Scanner(System.in);
		Scanner getDatas = new Scanner(System.in);
		System.out.println("Enter the input in number : ");
		int input = getInpput.nextInt();
		List<char[]> dataList = new LinkedList<char[]>();
		for(int i=0;i<input;i++) {
			dataList.add(getDatas.nextLine().toCharArray());
		}
		
		LinkedHashMap<Integer, Integer> managerMap = new LinkedHashMap<Integer, Integer>(1);
		LinkedHashMap<Integer, List<Integer>> freePositionMap = new LinkedHashMap<Integer, List<Integer>>();
		
		for(int i=0;i<dataList.size();i++) {
			char[] charData = dataList.get(i);
			for(int j=i;j < charData.length;j++) {
				if(Character.compare(charData[j], 'M') == 0) {
					managerMap.put(i, j);
				}else if(Character.compare(charData[j], 'V') == 0){
					List<Integer> JPosition = new LinkedList<>();
					if(freePositionMap.containsKey(i)) {
						JPosition = freePositionMap.get(i);
					}
					JPosition.add(j);
					freePositionMap.put(i, JPosition);
				}
			}
		}
		
		AtomicInteger distance = new AtomicInteger();
		
		managerMap.keySet().stream().forEach(K -> {
			Map<Integer, Integer> keyMapDiff = freePositionMap.keySet().stream().collect(Collectors.toMap(data -> data,  data -> data - K));
			Integer minValue = Collections.min(keyMapDiff.values());
			
			Set<Integer> minKeySet = keyMapDiff.entrySet().stream()
					      .filter(entry -> minValue.equals(entry.getValue()))
					      .map(Map.Entry::getKey).collect(Collectors.toSet());
			if(minKeySet.size() == 1) {
				distance.set(minValue);
			}
		});
		
		System.out.println(distance.intValue());
		
		getDatas.close();
		getInpput.close();
		
	}
	

}

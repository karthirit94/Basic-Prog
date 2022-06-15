package test;

import java.util.*;
import java.util.stream.Collectors;

public class MyCode {

	public static void main(String[] args) {
		// Output Act, cat, TAC, ant, Tan, bat, Tab
		   List<String> datas = Arrays.asList("ant","Tan","cat","TAC","Act","bat","Tab");
		    List<List<String>> groupedData = new ArrayList<>();
		    Map<Integer,List<String>> dataMap = new HashMap<>();
		    for(String data: datas){
		      char[] datasChar = data.toLowerCase().toCharArray();
		      int count = 0;
		      List<String> groupData = new ArrayList<>();
		      for(char dataChar: datasChar){
		        count = dataChar + 1 + count;
		      }
		      
		      if(dataMap.containsKey(count)){
		        groupData = dataMap.get(count);
		      }
		      groupData.add(data.toLowerCase());
		      dataMap.put(count,groupData);
		    }
		    dataMap.forEach((Integer K, List<String> V)->{
		        V.sort(Comparator.naturalOrder());
		        groupedData.add(V);
		    });
		    
//		    Collections.sort(groupedData, new CustomCompare());
		   Map<String, List<String>> firstElementMap = new HashMap<String, List<String>>();
		   for(List<String> values: groupedData){
			      firstElementMap.put(values.get(0), values);
			    }
		   List<String> sortedFirstElement = firstElementMap.keySet().stream().sorted().collect(Collectors.toList());
		   
		   StringBuilder resultData = new StringBuilder();
		   sortedFirstElement.stream().forEach(values -> {
			   for(String value: firstElementMap.get(values)){
				   datas.stream().filter(data -> value.equalsIgnoreCase(data)).forEach(data -> {
					   resultData.append(data).append(',');
				   });
			    }
		   });
		   resultData.deleteCharAt(resultData.length()-1); // to remove extra ','
		   System.out.println(resultData.toString());
	}

}

//class CustomCompare implements Comparator<List<String>>{
//	
//	@Override
//	public int compare(List<String> o1, List<String> o2) {
//		return o1.get(0).compareTo(o2.get(0));
//	}
//	
//}
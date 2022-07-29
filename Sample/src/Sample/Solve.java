package Sample;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solve {

	public static void main(String[] args) {
		
		
//		LocalDateTime data = LocalDateTime.of(2018, 06, 06, 21, 59, 36);
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
//		
//		data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'")); 
		
		
		
		
		
//		String str = "This This is is done by TATA TATA for TATA";
//		String[] strSplit = str.split(" ");
//		Map<String,Integer> dataMap = new HashMap<String,Integer>();
//		for(String data: strSplit) {
//			int count = 1;
//			if(dataMap.containsKey(data)) {
//				int value = dataMap.get(data);
//				count = value + count;
//			}
//			dataMap.put(data, count);
//		}
//		
//		for(Map.Entry<String,Integer> entity: dataMap.entrySet()) {
//			System.out.println(entity.getKey() + " : " + entity.getValue());
//		}
		
		// tream.of(strSplit).collect(Collectors.toMap(data -> data, null))
		
//		Stream.of(strSplit).forEach(data -> {
//			int count = 1;
//			if(dataMap.containsKey(data)) {
//				int value = dataMap.get(data);
//				count = value + count;
//			}
//			dataMap.put(data, count);
//		});
		
//		Map<String, List<String>> groupData = Stream.of(strSplit).collect(Collectors.groupingBy(data->data));
//		
//		for(Map.Entry<String,List<String>> entity: groupData.entrySet()) {
//			System.out.println(entity.getKey() + " : " + entity.getValue().size());
//		}
	}

}

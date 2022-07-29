import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testsapmle {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,5,5);
		Map<Integer, Integer> mapCon = num.stream().collect(Collectors.toMap(data -> data, data -> data));
		Map<Integer, Integer> r = num.stream().collect(Collectors.toMap(Function.identity(), data -> data, (a,b) -> a, LinkedHashMap::new));
//		OptionalDouble average = num.stream().mapToInt(data -> data).average();
//		double result = 0.0;
//		if(average.isPresent()) {
//			result = average.getAsDouble();
//		}
//		System.out.println(result);
		
		Collection<Integer> value = mapCon.values();
		for(Integer data : value) {
			System.out.print(data);
		}
		System.out.println("------------------");
		for(Map.Entry<Integer, Integer> det : r.entrySet()) {
			System.out.print(det.getValue());
		}
	}

}

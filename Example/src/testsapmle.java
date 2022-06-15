import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class testsapmle {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		Map<Integer, Integer> mapCon = num.stream().collect(Collectors.toMap(data -> data, data -> data));
		
//		OptionalDouble average = num.stream().mapToInt(data -> data).average();
//		double result = 0.0;
//		if(average.isPresent()) {
//			result = average.getAsDouble();
//		}
//		System.out.println(result);
		
		Collection<Integer> value = mapCon.values();
		for(Integer data : value) {
			System.out.println(data);
		}
	}

}

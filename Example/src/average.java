import java.util.Arrays;
import java.util.List;

public class average {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,2,3,4,5);
		double averageData = input.stream().mapToInt(data -> data).average().getAsDouble();
		System.out.println("Input's Average: " + averageData);
	}

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class palindrome {

	public static boolean checkPalindrone(String data){
		StringBuilder reverseString = new StringBuilder(data);
		reverseString.reverse();
		return reverseString.toString().equals(data);
	}
	public static void main(String[] args) {
		List<String> input = Arrays.asList("karthi","ravi","waaw","qasaq");
		List<String> result = input.stream().filter(palindrome::checkPalindrone).collect(Collectors.toList());
		for(String resultData: result) {
			System.out.println(resultData);
		}
	}
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> StringList = Arrays.asList("admin","age","ACE","beg","Int");
		List<String> result = StringList.stream().filter(data -> data.startsWith("a") && data.length()==3).collect(Collectors.toList());
		for(String resultData: result) {
			System.out.println(resultData);
		}
		
	}

}

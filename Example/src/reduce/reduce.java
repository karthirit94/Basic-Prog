package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("GFG", "Geeks", "for","GeeksQuiz", "GeeksforGeeks");
		Optional<String> q = words.stream().reduce((word1, word2)
                -> word1.length() > word2.length()
                ? word1 : word2);
		BiFunction<String,String,String> w = (a,b) -> {
			if(a.length() > b.length())
				return a + b;
			return b + a;
		};
		BinaryOperator<String> p = (a,b) -> {
			if(a.length() > b.length())
				return a;
			return b;
		};  
		Optional<String> v = words.stream().reduce(p);
		System.out.println(v.get());
		BiFunction<String,String,String> x = (a,b) -> a+b;
		String s= "srija";
		String f = words.stream().reduce(s, x, p);
		
//		words.stream().filter(a -> a.length() == 5).map(a -> {
//			return a;
//		}).allMatch(null)		
//		words.stream().reduce(null, null, null);
//		System.out.println(q.get().toString());
	}

}

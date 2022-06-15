package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionSample {

	public FunctionSample() {
		
	}

	public static void main(String[] args) {
		
		int a = 5;
//		int x = 0;
		Function<Integer, Integer> add = x -> x+1; 
		Integer e = add.apply(a);
		System.out.println(e.intValue());
		
		BiPredicate<Integer, Integer> biPre = (x,y) -> x==y;
		boolean q = biPre.test(5, 5);
		System.out.println(q);
		
		Function<Integer, Integer> mul = x -> x*10; 
		
		Integer r = add.andThen(mul).apply(a);
		System.out.println(r.intValue());
		System.out.println(add.compose(mul).apply(a).intValue());
		
		List<Integer> w = Arrays.asList(1,2,6);
//		w.stream().map(add).
		
		Map<String, Integer> z = new HashMap<String, Integer>();
		
		
	}

}

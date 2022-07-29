package deepCopy;

import java.util.Arrays;

public class DeepCopyArray {

	public static void main(String[] args) {
		int[][] a = new int[1][];
		a[0] = new int[] {43};
		// deep copy
		Arrays.stream(a).map(int[]::clone).toArray(int[][]::new);
		Arrays.stream(a).map(arr -> arr.clone()).toArray(s -> a.clone());
		Arrays.stream(a).map(d -> Arrays.copyOf(d, d.length)).toArray(int[][]::new);
		
		int[][] e = Arrays.stream(a)               
		.map(arr -> Arrays.copyOf(arr, arr.length))
		.toArray(int[][]::new);
		for(int[] w: e) {
			System.out.println(w.hashCode());
			for(int y: w) {
				System.out.println(y);
			}
		}
		for(int[] q: a) {
			System.out.println(q.hashCode());
		}
		int[][] g = Arrays.copyOf(a, a.length); // Shallow Copy
		for(int[] y: g) {
			System.out.println(y.hashCode());
		}
	}
}

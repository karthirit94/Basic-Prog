package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
//	Test() 
//    {  
//		
////		this.clone();
//        System.out.println("Test class object is created");  
//    }

	void sum(int a,long b){System.out.println("a method invoked");}    
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	public static void main(String[] args) {
		Test t = new Test();
//		t.sum(20,20);
		
		
//		String a = "fes det feef^nk";
//		char[] datas = a.toCharArray();
//	    String result = "";
//	    int i=0;
//	    do{
//	      if(i==0){
//	        result = result + Character.toString(Character.toUpperCase(datas[i]));
//	      }else{
//	        if(!Character.isLetter(datas[i])){
//	          continue;
//	        }else if(!Character.isLetter(datas[i-1])){
//	          result = result + Character.toString(Character.toUpperCase(datas[i]));
//	        }else{
//	          result = result + Character.toString(Character.toLowerCase(datas[i]));
//	        }
//	      }
//	     i++;
//	    }while(i<datas.length);
		
		
//		int num = 41352;
//		int result = -1;
//	    char[] datas = String.valueOf(num).toCharArray();
//	    int size = datas.length;
//	    int indexValue = size -1;
//	    while(indexValue > 0){
//	      if(datas[indexValue] > datas[indexValue-1]){
//	        break;
//	      }
//	      indexValue--;
//	    }
//	    if(indexValue != 0){
//	      int value = datas[indexValue -1];
//	      int minIndexValue = indexValue;
//	      for(int i=indexValue+1; i<size;i++){
//	        if(datas[i] > value && datas[i] < datas[minIndexValue]){
//	          minIndexValue = i;
//	        }
//	      }
//	      char temp = datas[indexValue-1];
//	      datas[indexValue-1] = datas[minIndexValue];
//	      datas[minIndexValue] = temp;
//	      Arrays.sort(datas,indexValue,size);
//	      String resultData = "";
//	      for(char data: datas){
//	        resultData+=Character.toString(data);
//	      }
//	      result = Integer.valueOf(resultData);
//	    }
//	     result;
		
//		String a = "100";
//	    String b = "010";
//	    String result = "";
//			int size = a.length() - 1;
//	    for(int i=size;i>=0;i--){
//	      if(a.charAt(i) == '0' && b.charAt(i) == '0')
//	        result+=0;
//	      else
//	        result+=1;
//	    } 
//	    System.out.println(result);
//	   System.out.println(new StringBuilder(result).reverse().toString());
		
		
//		int N = 20;
//		for(int i=1;i<=N;i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				System.out.println("FB");
//			}else if(i %3 == 0) {
//				System.out.println("F");
//			}else if(i %5 == 0) {
//				System.out.println("B");
//			}else {
//				System.out.println(i);
//			}
//		}
//		int[] A = {1,3,2,4};
//		int[] B = {4,1,3,2,};
//		
//		int[] C = {3,1,2};
//		int[] D = {2,3,1};
//		
//		int[] E = {1,2,3,4};
//		int[] F = {2,1,4,4};
//		
//		int[] G = {1,2,3,4};
//		int[] H = {2,1,4,3};
//		
//		int[] I = {1,2,1};
//		int[] J = {2,3,3};
//		
//		int[] K = {1,2,2,3,3};
//		int[] L = {2,3,3,4,5};
		
//		int[] B = {1, 3, 6, 4, 1, 2};
//		String S = "4 5 6 - 7 +";
//		String B = "13 DUP 4 POP 5 DUP + DUP + -";
//		String C = "1048575 5 DUP + DUP";
//		String D = "3 DUP 5 - -";
//		String E = "5 6 + -";
//		test t = new test();
//		System.out.println(t.solution(A,B));
//		System.out.println(t.solution(C,D));
//		System.out.println(t.solution(E,F));
//		System.out.println(t.solution(G,H));
//		System.out.println(t.solution(I,J));
//		System.out.println(t.solution(K,L));
//		System.out.println(t.solution(B));
//		System.out.println(t.solution(C));
//		System.out.println(t.solution(D));
//		System.out.println(t.solution(E));
	}
	public boolean solution(int[] A, int[] B) {
		boolean result = true;
		int N = A.length;
		List<String> Adatas = new LinkedList<>();
		List<String> Bdatas = new LinkedList<>();
		for(int i=0;i<N;i++) {
			String AData = String.valueOf(A[i]);
			String BData = String.valueOf(B[i]);
			if(Adatas.contains(AData + BData) || Bdatas.contains(AData + BData)) {
				result = false;
				break;
			}else {
				for(String data:Adatas) {
					if(data.startsWith(AData)) {
						result = false;
						break;
					}
				}
				Adatas.add(AData + BData);
				Bdatas.add(BData + AData);
			}
		}
		return result;
	}
//	int result = -1;
//	String[] datas = S.split(" ");
//	List<Integer> resultList = new LinkedList<Integer>();
//	for(String data: datas) {
//		if(data.equals("+")) {
//			if(resultList.size() >=2 ) {
//				int size = resultList.size();
//				int lastElement = resultList.get(size-1);
//				int secondLastElement = resultList.get(size-2);
//				int newValue = lastElement + secondLastElement;
//				resultList.remove(size-1);
//				resultList.remove(size-2);
//				resultList.add(newValue);
//			}else {
//				resultList.removeAll(resultList);
//				result = -1;
//				break;
//			}
//		}else if(data.equals("-")) {
//			if(resultList.size() >=2 ) {
//				int size = resultList.size();
//				int lastElement = resultList.get(size-1);
//				int secondLastElement = resultList.get(size-2);
//				int newValue = lastElement - secondLastElement;
//				resultList.remove(size-1);
//				resultList.remove(size-2);
//				resultList.add(newValue);
//			}else {
//				resultList.removeAll(resultList);
//				result = -1;
//				break;
//			}
//		}else if(data.equals("POP")) {
//			if(!resultList.isEmpty())
//				resultList.remove(resultList.get(resultList.size()-1));
//		}else if(data.equals("DUP")) {
//			if(!resultList.isEmpty())
//				resultList.add(resultList.get(resultList.size()-1));
//		}else if(Integer.valueOf(data) >= 2000) {
//			resultList.removeAll(resultList);
//			result = -1;
//			break;
//		}else {
//			resultList.add(Integer.valueOf(data));
//		}
//	}
//	if(!resultList.isEmpty()) {
//		result = resultList.get(resultList.size()-1);
//	}
//	return result;
	
	// write your code in Java SE 8
//	int arraySize = A.length;
//	int lastElement = A[arraySize - 1];
//	int result = 1;
//	Arrays.sort(A);
//	if(lastElement < 0){
//		result = 1;
//	}else {
////		Set<int[]> t = Stream.of(A).map(data->data).collect(Collectors.toSet());
//		Set<Integer> valueSet = new HashSet<Integer>();
//		if(valueSet.size() == A.length){
//			result = lastElement + 1; 
//		}else{
//			for (int i = 0; i < arraySize; i++) {
//				if (A[i] == result)
//					result++;
//				}
//		}
//	}

}

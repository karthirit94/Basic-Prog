package sample;

public class binaryAddition {

	public binaryAddition() {
		
	}

	public static void main(String[] args) {
		
		String a = "00011";
		String b = "01010";
		char[] r = a.toCharArray();
		System.out.println("Geeks Method : " + geeksMethod(a,b));
		System.out.println("My Alter Geeks Method : " + alterGeeksMethod(a,b));
		System.out.println("My Method : " + MyMethod(a,b));
	}

	private static String alterGeeksMethod(String a, String b) {
		// TODO Auto-generated method stub
		
		
		String result = "";
		int remainder = 0;
		int aSize = a.length() - 1;
		int bSize = b.length() - 1;
		while(aSize >=0 || bSize >=0) {
			if(aSize >=0)
			remainder = remainder + Integer.valueOf(String.valueOf(a.charAt(aSize)));
			if(bSize >=0)
				remainder = remainder + Integer.valueOf(String.valueOf(b.charAt(bSize)));
			result = (remainder%2) + result;
			remainder = remainder / 2;
			aSize--;
			bSize--;
		}
		String remainderString = String.valueOf(remainder);
		return remainderString + result;
	}

	private static String geeksMethod(String a, String b) {
		// TODO Auto-generated method stub
		String result = "";
		int remainder = 0;
		int aSize = a.length() - 1;
		int bSize = b.length() - 1;
		while(aSize >=0 || bSize >=0 || remainder == 1) {
			remainder = remainder + ((aSize >=0) ? a.charAt(aSize) - '0' : 0);
			remainder = remainder + ((bSize >=0) ? b.charAt(bSize) - '0' : 0);
			result = (char)(remainder%2 + '0') + result;
			remainder = remainder / 2;
			aSize--;
			bSize--;
		}
		return result;
	}

	private static String MyMethod(String a, String b) {
		
		int remainder = 0;
		int aSize = a.length() - 1;
		int bSize = b.length() - 1;
		String result = "";
		
//		int i=0,j=0;
		while(aSize >= 0 || bSize >= 0) {
			int addedData = remainder;
			if(aSize >= 0) {
//				i++;
//				System.out.println("a String loop count: " + i);
				addedData = addedData + Integer.valueOf(String.valueOf(a.charAt(aSize)));
//				System.out.println("a String loop count: " + aSize);
				aSize--;
			}
			if(bSize >= 0) {
//				j++;
//				System.out.println("b String loop count: " + j);
				addedData = addedData + Integer.valueOf(String.valueOf(b.charAt(bSize)));
//				System.out.println("b String loop count: " + bSize);
				bSize--;
			}
			if(addedData == 3) {
				result = result + 1;
				remainder = 1;
			}else if(addedData == 2) {
				result = result + 0;
				remainder = 1;
			}else if(addedData == 1) {
				result = result + 1;
				remainder = 0;
			}else {
				result = result + 0;
				remainder = 0;
			}
		}
		if(remainder == 1)
		result = result + remainder;
		String reverseResult = "";
		for(int l=result.length()-1; l>=0 ;l--) {
			reverseResult = reverseResult + result.charAt(l);
		}
		return reverseResult;
	}

}
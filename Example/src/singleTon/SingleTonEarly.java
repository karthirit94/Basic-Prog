package singleTon;

public class SingleTonEarly {
	
	// Early loading
	private static final SingleTonEarly singleTon = new SingleTonEarly();
	
	private SingleTonEarly(){
		
	}
	
	public static SingleTonEarly getInstance() {
			return singleTon;
	}
}

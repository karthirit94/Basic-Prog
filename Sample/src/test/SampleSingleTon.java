package test;

public class SampleSingleTon {
	
	
	private static SampleSingleTon instance = null; // 1
	
	private SampleSingleTon() {
		
	}
	
	public static SampleSingleTon getInstance() {
		if(instance == null) {
			synchronized (SampleSingleTon.class) {
				if(instance == null) {
				instance = new SampleSingleTon(); 
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		
		SampleSingleTon ST = SampleSingleTon.getInstance(); 
		
	}

}

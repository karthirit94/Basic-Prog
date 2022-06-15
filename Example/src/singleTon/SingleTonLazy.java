package singleTon;

public class SingleTonLazy {
	
	private static SingleTonLazy singleTon = null;
	
	private SingleTonLazy() {
		
	}
	
	public static SingleTonLazy getInstance() {
		if(singleTon == null) {
			singleTon = new SingleTonLazy();
		}
		return singleTon;
	}
}

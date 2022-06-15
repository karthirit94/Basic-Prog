package singleTon;

public class SingleTonSync {
	private static volatile SingleTonSync singleTonSync;
	
	private SingleTonSync(){
		
	}
	
	private static SingleTonSync getIns() {
		if(singleTonSync == null) {
			synchronized (SingleTonSync.class) {
				singleTonSync = new SingleTonSync();
			}
		}
		return singleTonSync;
	}
	
	
//	private static synchronized SingleTonSync getIns() {
//		if(singleTonSync == null) {
//			singleTonSync  = new SingleTonSync();
//		}
//		return singleTonSync;
//	}
}

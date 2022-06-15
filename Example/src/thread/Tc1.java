package thread;

public class Tc1 {
	public static void main(String[] args) throws InterruptedException {
		Thread obj = new Thread(new C());
		obj.run();
//		obj.start();
//		obj.join();
		for(int i=10;i<20;i++)
			System.out.println(i);
	}
}

class C implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
	
} 
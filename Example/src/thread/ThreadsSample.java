package thread;

public class ThreadsSample extends Thread {
	int code = 9;
	public void run() {
		this.code = 7;
	}
	public static void main(String[] args) {
		ThreadsSample th = new ThreadsSample();
		th.start();
		for(int i=0;i<5;i++) {
			System.out.println(th.code);
		}
	}
}

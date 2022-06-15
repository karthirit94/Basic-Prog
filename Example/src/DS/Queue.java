package DS;

public class Queue {
	
	public int[] datas;
	
	int front;
	
	int capacity;
	
	int rear;
	
	int count;
	
	Queue(int size){
		datas = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
	public void EnQueue(int data) {
		if(isFull()) {
			System.exit(1);
		}
		rear = (rear + 1) % capacity;
		datas[rear] = data;
		count++;
	}
	
	public int DeQueue() {
		if(isEmpty()) {
			System.exit(1);
		}
		int data = datas[front];
		front = (front + 1) % capacity;
		count--;
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.exit(1);
		}
		return datas[count-1];
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == capacity;
	}
		
	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.EnQueue(5);
		queue.EnQueue(1);
		queue.EnQueue(9);
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.datas[i]);	
		}
		System.out.println("DeQueue : ");
		queue.DeQueue();
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.datas[i]);	
		}
		System.out.println("DeQueue : ");
		queue.DeQueue();
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.datas[i]);	
		}
		System.out.println("EnQueue : 10");
		queue.EnQueue(10);
		System.out.println("EnQueue : 15");
		queue.EnQueue(15);
		System.out.println("EnQueue : 12");
		queue.EnQueue(12);
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.datas[i]);	
		}
		System.out.println("DeQueue : ");
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.datas[i]);	
		}
		System.out.println("Peek : " + queue.peek());
	}

}

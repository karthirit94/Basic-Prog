package DS;

public class Stack {
	
	public int[] datas;
	public int top;
	public int capacity;
	public int count;
	
	Stack(int size){
		this.datas = new int[size];
		this.top = -1;
		this.capacity = size;	
		this.count = 0;
	}
		
	public void push(int data) {
		if(isFull()) {
			System.exit(1);
		}
		datas[++top] = data;
		count++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.exit(1);
		}
		count--;
		return datas[top--];
	}
	
	public int size() {
		return top + 1; // count
	}
	
	public int topElement() {
		if(isEmpty()) {
			System.exit(1);
		}
		return datas[top];
	}
	
	public boolean isFull() {
		return top == capacity - 1; // capacity==count;
	}
	
	public boolean isEmpty() {
		return top == -1; // count == 0;
	}
	
	public static void main(String[] args) {
			Stack stack = new Stack(10);
			stack.push(5);
			stack.push(8);
			for(int i= stack.size() -1; i>=0;i--) {
				System.out.println(stack.datas[i]);
			}
			System.out.println("Pop:");
			stack.pop();
			for(int i= stack.size() -1; i>=0;i--) {
				System.out.println(stack.datas[i]);
			}
			System.out.println("Push:9");
			stack.push(9);
			for(int i= stack.size() -1; i>=0;i--) {
				System.out.println(stack.datas[i]);
			}
			System.out.println("Pop:");
			stack.pop();
			for(int i= stack.size() -1; i>=0;i--) {
				System.out.println(stack.datas[i]);
			}
			System.out.println("Push:15");
			stack.push(15);
			for(int i= stack.size() -1; i>=0;i--) {
				System.out.println(stack.datas[i]);
			}
			System.out.println("Top Element : " + stack.topElement());
	}
}
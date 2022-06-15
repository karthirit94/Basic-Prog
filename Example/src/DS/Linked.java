package DS;

public class Linked {
	
	private LinkedNode head;
	
	Linked(){
		this.head = null;
	}
	
	public void insertData(int data) {
		this.head = insert(head,data);
	}
	
	public void search(int data) {
		LinkedNode node = searchData(data);
		if(node != null && node.data == data)
			System.out.println(data + " Found");
		else
			System.out.println(data + " Not Found");
	}
	
	public void datas() {
		LinkedNode node = head.node;
		while(node!=null) {
			System.out.print(node.data);
			node = node.node;
		}
	}
	
	private LinkedNode searchData(int data) {
		return searchData(head,data);
	}

	private LinkedNode searchData(LinkedNode head, int data) {
		if(head == null || head.data == data) {
			return head;
		}else {
			return searchData(head.node, data);
		}
	}

	private LinkedNode insert(LinkedNode head, int data) {
		if(head == null) {
			head = new LinkedNode(data);
		}else {
			head.node = insert(head.node, data);
		}
		return head;
	}

	public static void main(String[] args) {
		Linked obj = new Linked();
		obj.insertData(8);
		obj.insertData(4);
		obj.insertData(9);
		obj.insertData(6);
		obj.insertData(1);
		obj.insertData(5);
		System.out.println("Datas : " );
		obj.datas();
		System.out.println("\nSearched Data : ");
		obj.search(0);
		obj.search(5);
		obj.search(9);
		obj.search(10);
	}

}

class LinkedNode{
	public int data;
	public LinkedNode node;
	LinkedNode(int data){
		this.data = data;
		this.node = null;
	}
}

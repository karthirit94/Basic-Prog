package DS;

public class BinaryTree {
	
	private Node root;
	
	BinaryTree(){
		this.root = null;
	}
	
	public void insertTree(int data) {
		this.root = insert(root,data);
	}
	
	public void search(int data) {
		Node node = searchTree(data);
		if(node != null && node.data == data)
			System.out.println(data + " Found");
		else
			System.out.println(data + " Not Found");
	}
	
	
	public void preOrderTraversal() {
		preOrder(root);
	}
	
	public void inOrderTraversal() {
		inOrder(root);
	}
	
	public void postOrderTraversal() {
		postOrder(root);
	}
	
	private void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

	private void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	private void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);	
	}

	private Node searchTree(int data) {
		return search(root,data);
	}
	
	private Node search(Node root, int data) {
		if(root == null || root.data == data) {
			return root;
		}else if(root.data > data) {
			return search(root.left,data);
		}else {
			return search(root.right, data);
		}
	}

	private Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}else if(root.data > data) {
			root.left = insert(root.left,data);
		}else if(root.data < data) {
			root.right = insert(root.right,data);
		}
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTree BT = new BinaryTree();
		BT.insertTree(05);
		BT.insertTree(95);
		BT.insertTree(35);
		BT.insertTree(65);
		BT.insertTree(49);
		BT.insertTree(75);
		BT.insertTree(19);
		
		BT.search(19);
		BT.search(99);
		BT.search(35);
		BT.search(5);
		BT.search(50);
		BT.search(65);
		
		System.out.println("Pre-Order : ");
		BT.preOrderTraversal();
		System.out.println("In-Order : ");
		BT.inOrderTraversal();
		System.out.println("Post-Order : ");
		BT.postOrderTraversal();
				
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
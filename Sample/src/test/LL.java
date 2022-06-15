package test;

import java.util.ArrayList;
import java.util.List;

public class LL {
	
	private LLNode head;
	
	LL(){
		this.head = null;
	}
	
	public void insert(int data) {
		this.head = insert(head,data);
	}
	
	private LLNode insert(LLNode node, int data) {
		if(node == null)
			node = new LLNode (data);
		else
			node.node = insert(node.node,data);
		return node;
	}
	
	public List<Integer> getData(){
		List<Integer> result = new ArrayList<>();
		LLNode node = head.node;
		while(node!=null) {
			int element = node.data;
			node = node.node;
			result.add(element);
		}
		return result;
	}
	
	public List<Integer> getDataReverse(){
		List<Integer> result = new ArrayList<>();
		List<Integer> data = getData();
		for(int i=data.size()-1;i>=0;i--) {
			result.add(data.get(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		LL obj = new LL();
		
	}

}


class LLNode{
	int data;
	LLNode node;
	LLNode(int data){
		this.data = data;
		this.node = null;
	}
}

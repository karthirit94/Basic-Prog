package test;

public class LList {

	LListNode initialData;
	
	public LList() {
		initialData = null;
		
	}
	
	public LListNode insertElement(String data,LListNode node) {
		if(node.left != null) { 
			return insertElement(data,node.left);
				}else {
					node.left = new  LListNode(data);
					return node.left;
				}
	
//		node = new  LCListNode(data);
//		return node;
//	if(node == null)
//		node = new LListNode (data);
//	else
//		node.left = insertElement(data,node.left);
//	return node;
	}
	
	
	public void insert(String data) {
		
		if(initialData == null) {
//			initialData = insertElement(data,initialData);
			initialData = new  LListNode(data); //
		}else { 
			insertElement(data,initialData);
		}
		
		
		
//		else {
////			initialData.left;
//			initialData.left = new LListNode(data);
//		}
//		do {
//			System.out.println(initialData.data);
//			initialData = initialData.left;
//		}while(initialData != null);
	}
	
	public void getAllData() {
		
		if(initialData == null) {
				System.out.println("No Data Found");
		}else {
			do {
				System.out.println(initialData.data);
				initialData = initialData.left;
			}while(initialData != null);
		}
	}
	
	
	public static void main(String[] args) {
		LList a = new LList();
		a.insert("karthi");
		a.insert("Sheik");
		a.insert("gowtham");
		a.insert("prem");
		a.getAllData();
//		int a = 10;
		
//		a.getAllData();
		
	}

}

class LListNode{
	String data;
	LListNode left = null;
	
	LListNode(String data){
		this.data = data;
	}
}


// Karthi,addess -> sheik,address -> gowtham,null 



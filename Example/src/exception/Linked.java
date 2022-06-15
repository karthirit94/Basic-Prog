//package exception;
//
//public class Linked {
//	
//	public Element nextElement;
//	
//	public static int count = 0;
//	
//	public int data;
//	
//	public static int index = 0;
//	
//	Linked(int data,Element nextElement){
//		this.data = data;
//		this.nextElement = null;
//	}

//	public void insert(int data) {
//		if(count == 0) {
//		this.data = data;
//		Element element = new Element();
////		element.data = data;
////		element.nextValue = data;
//		this.nextElement = element;
////		return new Linked(data, element);
//		}else {
//			
//		}
//		count++;
//	}
//	
//	public Element searchWithIndex(int i) {
//		
//	}
//	
//	public int search(int data) {
//		int value = 0;
//		if(this.data == data) {
//			value =  data;
//		}else {
//			if (nextElement.data == data) {
//				value =  nextElement.data;
//			}
//		}
//		return value;
//	}
//
//	public static void main(String[] args) {
//		Linked link = new Linked();
//		link.insert(10);
//		link.insert(13);
//		
//	}
//
//}
//
//class Element{
//	public int data;
//	public int nextValue;
//}

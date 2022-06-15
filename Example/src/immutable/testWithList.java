package immutable;

import java.util.ArrayList;
import java.util.List;

final class RetailBusi {
	private final String retailerName;
	private final List<String> productName;
	public RetailBusi(String retailerName, List<String> productName) {
		this.retailerName = retailerName;
		List<String> proName = new ArrayList<>();
		productName.forEach(proName::add);
		this.productName = proName;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public List<String> getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "RetailBusi [retailerName=" + retailerName + ", productName=" + productName + "]";
	}
	
}

public class testWithList {
	
	public static void main(String[] args) {
		List<String> productName = new ArrayList<String>();
		productName.add("TV");
		productName.add("Mobile");
		String retailerName = "Sathya";
		RetailBusi obj = new RetailBusi(retailerName,productName);
		System.out.println(retailerName);
		System.out.println(obj.getRetailerName());
		retailerName = "Andavur";
		System.out.println(retailerName);
		System.out.println(obj.getRetailerName());
//		System.out.println(productName.size());
		for(String product: productName) {
			System.out.println(product);
		}
		
//		List<String> productList = obj.getProductName();
//		System.out.println(productList.size());
		for(String product: obj.getProductName()) {
			System.out.println(product);
		}
		productName.add("Fridge");
//		System.out.println(productName.size());
		for(String product: productName) {
			System.out.println(product);
		}
		obj.getProductName().add("Speaker");
		for(String product: obj.getProductName()) {
			System.out.println(product);
		}
		
//		productList.add("Speaker");
//		for(String product: productList) {
//			System.out.println(product);
//		}
//		System.out.println("last O/P");
//		for(String product: obj.getProductName()) {
//			System.out.println(product);
//		}
	}
}

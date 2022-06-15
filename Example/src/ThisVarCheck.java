
public class ThisVarCheck {
	
	String data = "Blue";

	public static void main(String[] args) {
		new ThisVarCheck().test("Straw");
	}
	
	public void test(String data){
		this.data = "Ruby";
		System.out.println(data + "berry");
		System.out.println(this.data + "berry");
	}
	
}

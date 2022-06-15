package override;

public class calling {

	public static void main(String[] args) {
		
		child1 r1 = new child1();
		r1.test("aaaaaaaaa");
		
		base r = new child1();
		r.test("aaaaaaaaa");
	}

}

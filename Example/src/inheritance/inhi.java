package inheritance;

public class inhi {

	public static void main(String[] args) {
		Parent r = new Child();
		r.p1(); // r.c1() is not access 
		Child t = new Child();
		t.c1();
		t.p1();
		Parent q = new Parent();
		q.p1();
		ChildOver p = new ChildOver();
		p.p1();
		p.p();
		Parent n = new ChildOver();
		n.p1();
	}
	
}

class ChildOver extends Parent{
	@Override
	public void p1() {
		System.out.println("ChildOver");
	}
	public void p() {
		super.p1();
	}
}

class Child extends Parent{
	public void c1() {
		System.out.println("Child");
	}
}

class Parent {
	public void p1() {
		System.out.println("Parent");
	}
}

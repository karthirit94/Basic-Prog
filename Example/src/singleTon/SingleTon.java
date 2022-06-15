package singleTon;

public class SingleTon {
	
	public static void main(String[] args) {
		System.out.println("Early");
		SingleTonEarly e = SingleTonEarly.getInstance();
		System.out.println(e.hashCode());
		SingleTonEarly q = e;
		System.out.println(q.hashCode());
		SingleTonEarly z = SingleTonEarly.getInstance();
		System.out.println(z.hashCode());
		System.out.println("Lazy");
		SingleTonLazy m = SingleTonLazy.getInstance();
		System.out.println(m.hashCode());
		SingleTonLazy n = m;
		System.out.println(n.hashCode());
		SingleTonLazy o = SingleTonLazy.getInstance();
		System.out.println(o.hashCode());
//		SingleTonSync c = SingleTonSync.
	}

}

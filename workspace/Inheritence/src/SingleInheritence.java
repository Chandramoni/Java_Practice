
public class SingleInheritence {
	void m1() {
		System.out.println("Inside m1");
	}

	public static void main(String[] args) {
		SingleInheritence s = new SingleInheritence();
		s.m1();
		s.hashCode();
		s.getClass();
	}
}

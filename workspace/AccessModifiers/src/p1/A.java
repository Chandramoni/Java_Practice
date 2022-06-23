package p1;

public class A {
	private int a = 10;
	int b = 3;
	protected int c = 34;
	public int d = 50;

	public static void main(String[] args) {
		A aObject = new A();
		System.out.println(aObject.a);
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);
	}

}

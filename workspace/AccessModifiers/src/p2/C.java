package p2;

import p1.A;

public class C extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aObject = new A();
		System.out.println(aObject.d);
		C cObject =new C();
		System.out.println(cObject.c);
		System.out.println(cObject.d);
	}

}


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!!");
		HelloWorld.method1();
	}
	static {
		System.out.println("Inside static block1");
	}
	static{
		System.out.println("Inside static block2");
	}
	static void method1() {
		System.out.println("Inside method1");
	}
}

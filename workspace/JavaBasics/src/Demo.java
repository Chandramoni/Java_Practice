
public class Demo {
	// static Demo x;
	// static {
	// System.out.println(Demo.x);
	// Demo.x = new Demo();
	//
	// }
	//
	// public static void main(String[] args) {
	// System.out.println(Demo.x);
	// }

	static Demo obj = new Demo();

	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}

	static {
		System.out.println("From static block" + Demo.obj);
		Demo.obj = Demo.init();
	}

	static Demo init() {
		return new Demo();
	}
}

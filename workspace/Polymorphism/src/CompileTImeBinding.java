
public class CompileTImeBinding {
	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result :" + result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println("result : " + result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("result : " + result);
	}

	public static void main(String[] args) {
		CompileTImeBinding obj = new CompileTImeBinding();
		obj.add(10, 20);
		obj.add(40f, 60f);
		obj.add(2, 3, 4);
	}
}

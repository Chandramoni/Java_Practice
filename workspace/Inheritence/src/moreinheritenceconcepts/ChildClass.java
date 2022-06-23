package moreinheritenceconcepts;

//import SuperClass;

public class ChildClass extends SuperClass {
	ChildClass() {
		this(10);
		System.out.println("No arg childclass constructor");
	}

	ChildClass(int x) {
		super(x);
		System.out.println(" arg childclass constructor");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}

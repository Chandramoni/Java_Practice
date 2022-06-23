package moreinheritenceconcepts;

public class SuperClass {
	int x;

	public SuperClass() {
		System.out.println("No Arg Superclass constructor");
	}

	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One arg constructor");
	}
}

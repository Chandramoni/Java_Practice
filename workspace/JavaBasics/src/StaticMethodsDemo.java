
public class StaticMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		StaticMethodsDemo.mehtod1();
	}
    static void mehtod1() {
    	System.out.println("Inside static method1");
    }
    static{
    	System.out.println("Inside static block");
    	StaticMethodsDemo.mehtod1();
    }
}

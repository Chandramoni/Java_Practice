import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter two numbers");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c = a / b;
		System.out.println("result" + c);
		System.out.println("MOre code can go here");
	}

}

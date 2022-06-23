
public class CommandLineArguements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = args.length;
		if (length == 0) {
			System.out.println("no input privided");
		} else {
			System.out.println("list of arguments");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}

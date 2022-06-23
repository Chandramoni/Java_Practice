package RuntimePoly;

public class MacBook  implements AppleLaptop{
	@Override
	public void start() {
		System.out.println("Inside macbook start");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside macbook shutdown");
	}
}

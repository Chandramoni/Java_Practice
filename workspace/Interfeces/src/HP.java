
public abstract class HP implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Inside HP scroll");
	}

	@Override
	public abstract void click();

}

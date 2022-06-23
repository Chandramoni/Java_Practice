
public abstract class DELL implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Inside DELL scroll");
	}

	@Override
	public abstract void click();

}

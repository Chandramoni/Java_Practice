package Interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside hondas go");
	}

	@Override
	public void stop() {
		System.out.println("inside hondas stop");
	}

}

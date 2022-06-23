package RuntimePoly;

public class Test {

	public static void main(String[] args) {
		// MacBook m1 = new MacbookAir();
		// MacBook m2 = new MacBookPro();
		// m1.start();
		// m1.shutdown();
		// m2.start();
		// m2.shutdown();
		AppleLaptop m1 = new MacBookPro(); // upcasting
		AppleLaptop m2 = new MacbookAir(); // upcasting
		MacBookPro m3 = (MacBookPro) m1;
		MacbookAir m4 = (MacbookAir) m2;
		m1.start();
		m1.shutdown();
		m2.start();
		m2.shutdown();
		m3.prosmethod();
	}

}

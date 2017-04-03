package test.copy;

public class PrimeThread {

	public static void main(String[] args) {
		Thread p = new Thread(() -> System.out.println("system testing"));
		p.start();
	}
}
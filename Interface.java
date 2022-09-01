package basics;

public class Interface implements Cars{

	public static void main (String [] args) {
		
	}

	@Override
	public void start() {
		System.out.println("my car is starting.");
	}
}

interface Cars{
	void start();
}
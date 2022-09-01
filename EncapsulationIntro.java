package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setPrice(23);
		System.out.println(l1.getPrice());
	}

}


class Laptop{

	int ram;
	int price;

	
//	getter and setter used to much :
//	right click -> src -> generate getter and setters
	
	public void setPrice(int price) {
//		check whether user is adm in;
		
		boolean isAdmin = true; // or any authorization method
		
		if(!isAdmin) {
			System.out.println("Can't change.");
		}else {
			this.price = price;
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	
}


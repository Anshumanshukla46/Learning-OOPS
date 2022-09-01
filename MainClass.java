package basics;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // new use for creating objects
		p1.age = 19;
		p1.name = "Anshuman";
		
		Person p2 = new Person();
		p2.age = 32;
		p2.name = "conio";
		
		System.out.println(p1.age+" "+p1.name);
		System.out.println(p2.age+" "+p2.name);
		 
		p1.eat();
		p2.walk();
		
		p1.walk(2);
		
		 
//		static keyword
		System.out.println(Person.count);
		
		
		Person p3 = new Person(31,"Shivam");
		
//		Inheritance
		Developer d1 = new Developer(24,"Anshuman");
		d1.doWork();
		
		
//		Encapsulation
	}
} 

  
class Person{
//	properties
	protected String name;
	int age;
	
	static int count = 0;
	
//	Constructor
	public Person() {
		count++;
		System.out.println("Creating object.");
	}
	
	
	public Person(int newAge,String newName) {
		this();
		name = newName;
		age = newAge;
	}
	
	public Person(int age) {
		this(23,"sdh");
		this.age = age;
		
	}
	
//	Methods
	
	void eat() {
		System.out.println(name+" is eating.");
		
	}
	
//	polymorphism : compile-time
	void walk() {
		System.out.println(name +" is walking.");
	}
	
	void walk(int steps) {
		System.out.println(name+" walked "+steps+" steps.");
	}
	
	
	void doWork() {
		System.out.println("Person is working.");
	}
	
}


class Developer extends Person{
	 public Developer(int age, String name) {
		 super(age,name);
	 }
	 
//	 polymorphism : run-time
	 void walk() {
		 System.out.println("Developer "+name+" is walking.");
	 }
}
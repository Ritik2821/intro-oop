package Inheritance;

public class Person {
	public Person(String name) {
		this.name=name;
		
		System.out.println("Inside person constructor");
	}
	protected String name;
	
	public void eat() {
		
		System.out.println(name+ " is eating");
	}
	public void walk() {
		System.out.println( name+ " is walking");
	}
	

}

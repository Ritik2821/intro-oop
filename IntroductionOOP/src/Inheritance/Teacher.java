package Inheritance;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
	
		System.out.println("inside teacher comstructor");
	}
	public void teach() {
		
		System.out.println( name+ "  is a teacher is teaching");
	}
	public void eat() {
		//super.eat();
		System.out.println(name+ "  is a teacher is teaching ");
	}

}

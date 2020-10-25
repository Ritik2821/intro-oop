package Polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		
		Pet p=d;
		Animal a=d;          //OVERRIDDING
		System.out.println(d.name);
		System.out.println(p.name);
//	    d.walk();			//UPCASTING
//		
//		p.walk();
//**********************************************************************************
//		greetings();
//		greetings("HEY, RITIK");
//		greetings("COUNT ME IN",5);
//
//	}
//	public static void greetings() {
//		System.out.println("Good Morning");
//	}
//	public static void greetings(String s) {          //OVERLOADING
//		System.out.println(s);
//	}
//	public static void greetings(String s,int count)
//	{
//		for(int i=0;i<count;i++) {
//			System.out.println(s);
//		}
	}

}

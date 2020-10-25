package Encaptulation;

public class encaptulation {           //LET STUDENT CLASS
	 private int age;
	  private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.println("Age is greater");
		}else{
			this.age=age;
		}
		System.out.println(age);
		
	}

}

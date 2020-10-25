import java.util.*;
public class main {

	public static void main(String[] args) {
		ArrayList <String> name=new ArrayList<>();
		name.add("Anuj");
		name.add("Ritik");
		name.add("Ram");
		name.add("Prajjawal");
		System.out.println(name);     //ADD METHOD
        
		System.out.println(name.get(0));  //GET
		System.out.println(name.set(1, "Amaan")); //SET
		System.out.println(name);
		
//		System.out.println(name.remove(1));
//		System.out.println(name);          //REMOVE
//		
//		name.clear();
//		System.out.println(name);  //CLEAR
		
	     //  System.out.println(name.contains("Ram")); //CONTAINS
		
	     
	     
//	     List<String>toRemove=new ArrayList();
//	     toRemove.add("Apple");
//	     toRemove.add("Banana");
//	     toRemove.add("Kiwi");
//	     System.out.println(toRemove);
//	     
//	     name.addAll(toRemove);
//	     System.out.println(name);    //ADDALL METHOD
//	     
//	     System.out.println(name.isEmpty()); //IS EMPTY
	     
	     
//	     List<String>Remove=new ArrayList();
//	     Remove.add("Amaan");
//	     Remove.add("Ram");
//	     Remove.add("Anuj");
//	                               //REMOVE ALL()
//	     name.removeAll(Remove);
//	     System.out.println(name);
//	     System.out.println(name.size());  //SIZE
//	     
//	     name.add("Ritik");
//	     System.out.println(name.size()); //ADD AND SIZE DISPLAY
//	     
	     
	   String temp[]=new String[name.size()];
	   name.toArray(temp);
	   
	   for(String e:temp) {
		   System.out.println(e);
	   }
	     
	     
}
	}

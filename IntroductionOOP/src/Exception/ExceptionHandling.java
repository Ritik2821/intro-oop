package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try{                              //DIVIDE BY ZERO ERROR
//			int a=5;  
//											//TRY CATCH
//			int b=0;
//			int c=a/b;
//			System.out.println(c);
			
			int d[]=new int[5];                 //MULTIPLE CATCH
			System.out.println(d[6]);
		   }
			catch(ArithmeticException e) {
			System.out.println(e.getMessage()+  "  Divide by zero Error ");
		   }catch(ArrayIndexOutOfBoundsException e) {
			   
			   System.out.println("OUT OF BOUND EXCEPTION");
		   }
			finally {
				System.out.println("Sorry");
			}
			       
			//System.out.println("Sorry for the inconvinienvce");
	   }
	
	}



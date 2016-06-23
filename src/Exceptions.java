
public class Exceptions {
	
	public static void main (String[] args){
		
		int a = 5;
		int b = 0;
		
		try{
			int c = a/b; // we know it won't work but we try anyway
		}
		catch (ArithmeticException e){
			
			System.out.println("You can't divide by zero!");;
		}
	}
}

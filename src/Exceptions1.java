import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions1 {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args){
		
		System.out.print("Enter an integer: ");
		int i = getAnInteger();
		System.out.println("The integer you've entered is: "+i);
	}
	
	public static int getAnInteger(){
		while(true){
			
			try{
				return in.nextInt();
			}
			catch(InputMismatchException e){
				in.next();
				System.out.println("That's not an integer, please try again");
			}
		}	
		
	}
}

// this code avoids exceptions by using method hasNextInt() from class Scanner

import java.util.Scanner;

public class Exceptions2 {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args){
		
		System.out.print("Enter an integer: ");
		int i = getAnInteger();
		System.out.println("The integer you've entered is: "+i);
	}
	
	public static int getAnInteger(){
		
		while(!in.hasNextInt()){
			
			in.nextLine();
			System.out.println("That's not an integer, please try again!");
		}
		
		return in.nextInt();
	}
}

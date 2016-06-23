
public class Exceptions0 {
	
	public static void main (String[] args){
		
		int a = 5;
		int b = 0;
		int c;
		
		try{
			c = a/b; // we know it won't work but we try anyway
		}
		catch (Exception e){
			
			System.out.println("You can't divide by zero!"+e);
		}
	}
}


public class CrazyWithZeros {
	
	public static void main (String[] args){
		try{
			int answer = divideTheseNumbers(5, 0);
		}
		catch (Exception e){
			System.out.println("Tried twice, still didn't work");
		}
	}
	
	public static int divideTheseNumbers(int a, int b) throws Exception{
		int c;
		try{
			c = a/b;
			System.out.println("it worked!");
		}
		catch(Exception e){
			System.out.println("didn't work first time");
			c = a/b;
			System.out.println("it work second time");
		}
		finally{
			System.out.println("Better clean up the mess.");
		}
		
		System.out.println("it worked after all");
		return c;
		
	}
}

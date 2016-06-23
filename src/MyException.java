
public class MyException {
	
	public static void main(String[] args){
		
		try{
			
			doSomething(true);
		}
		catch(Exception e){
			
			System.out.print("Exception!" +e);
		}
	}
	
	public static void doSomething(Boolean value) throws Exception {
		
		if(value){
			throw new Exception();
		}
	}
}

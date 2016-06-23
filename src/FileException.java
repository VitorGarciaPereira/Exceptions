import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class FileException {
	
	public static void main(String[] args) {
		try{
			openFile("c:\test.txt");
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	}
	
	// this method throws an exception that is handled by the main method
	
	public static void openFile(String path) throws Exception{
		
		//try{
			FileInputStream f = new FileInputStream(path);
		//}
		//catch(FileNotFoundException e){
			
			//System.out.print("File not found ");
		//}
	}
}

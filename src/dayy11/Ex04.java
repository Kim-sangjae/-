package dayy11;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
	
		try {	
			
		  getMember();
		
	   } catch (FileNotFoundException | ClassNotFoundException e) {
		 e.printStackTrace();
		 
       } catch (Exception e ) {  // 모르는 예외
    	 e.printStackTrace();
    	   
       }
		
		
       }
		
		
	
	
	
	public static void getMember() throws FileNotFoundException , ClassNotFoundException {
		FileInputStream fis = new FileInputStream("a.txt");
		Class.forName("dayt11.Ex02");
	}

}

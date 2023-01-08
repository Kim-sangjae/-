package dayy11;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		
		try {
		 FileInputStream fis = new  FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("프로그램 실행이 되나요?");
		 
		
		
		

	}

}

package TESTS;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader read = new FileReader("anisha.txt");
			BufferedReader buffer = new BufferedReader(read);
			
			
			try {
				String Line = buffer.readLine();
						while (Line !=null) {
						System.out.println(Line);	
						Line=buffer.readLine();
								
						}
						buffer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}
				
			}
		}

}

}

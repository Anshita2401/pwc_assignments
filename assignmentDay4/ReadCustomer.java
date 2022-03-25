package assignmentDay4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCustomer {
	public static String acceptString() {
		String stringData=null;
		BufferedReader input=null;
		try {
			input=new BufferedReader(new InputStreamReader(System.in));
			stringData=input.readLine();
		}
		catch(IOException e) {
			System.out.println("Error in accepting data");
		}finally {
			if(input!=null) {
				input=null;
			}
		}
		return stringData;
		
	}
}
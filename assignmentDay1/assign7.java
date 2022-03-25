package assignmentDay1;

public class assign7 {
	public static void main(String args[])
	{
		boolean bool1=false;
		boolean bool2=true;
		boolean bool3=true;
		if(bool1||(bool1 ||(bool2=true))) 
			System.out.println("sucess");
		else
			System.out.println("Failure");
		System.out.println("bool2 val is "+ bool2);	
	}

}

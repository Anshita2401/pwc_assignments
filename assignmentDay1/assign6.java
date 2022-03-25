package assignmentDay1;

public class assign6 {
	public static void main( String[] args)
	{
		int intval=10;
		float floatVal=3.0f;
		boolean bool1=true;
		boolean bool2=false;
		boolean bool3=true;
		System.out.println("arithematic");
		System.out.println( intval +"%" + floatVal+ "=" + intval%floatVal);
		
		System.out.println("concatination");
		System.out.println( "day " +  2 + " session");
		System.out.println( "2" + "+" + "3" + "=" + (2+3));
		
		System.out.println("RELATIONAL: equality operator");
		System.out.println( intval + " == " + floatVal + " = " +(intval==floatVal));
		
		floatVal=10.0f;
		System.out.println( intval + " == " + floatVal + " = " +(intval==floatVal));
		
		bool2=false;
		if(bool1 || (bool1 && (bool2==false))) 
			System.out.println("SUCESS");
		else 
			System.out.println("FAILURE");
		
		System.out.println("Bool2 value is : "+ bool2);		
	}

}

package assignmentDay6;

public class UserType {
	
	String name;
	
	UserType (String ParameterVal)
	{
		name=ParameterVal;
	}
	
	UserType(){
		this("students");
	}
	
	public static void main(String[] args) {
		UserType u1=new UserType("faculty");
		UserType u2=new UserType();
		
		System.out.println(u1.name);
		System.out.println(u2.name);
	}
}

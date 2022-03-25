package assignmentDay6;

public class PassByVal {
	
	public static void main(String[] args) {
		int sId=25;
		PassByVal val=new PassByVal();
		System.out.println(sId);
		
		val.passTheValueMethod(sId);
		System.out.println("the sid are: "+sId);
		
		
	}
	
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("the sid are: "+sId);
	}

}

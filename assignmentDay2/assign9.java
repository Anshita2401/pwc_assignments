package assignmentDay2;
public class assign9 {
	int i=22;
	int j=14000;
	public static void main (String args[]) {
		int i=22;
		int j=14000;
		assign9 a9=new assign9();
		boolean k=a9.method1(i);
		boolean l=a9.method2(j);
		if(k==true && l==true)
			System.out.println("is a new employee..");
		else 
			System.out.println("not a new employee...");}
	public boolean method1(int i){
		if(i>20 && i<30)
			return true;
		else return false;
	}
	public boolean method2(int j){
		if(i>14000 && i<20000)
			return true;
		else return false;
	}
}

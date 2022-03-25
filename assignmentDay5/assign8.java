package assignmentDay5;

public class assign8 {
	static int i=22;
	static int j=14000;
	static boolean k;
	static boolean l;
	
	public static void main(String[] args) {
		i=35;
		j=14000;
		assign8 a=new assign8();
		k=a.method1(i);
		l=a.method2(j);
		
		if(k==true && l==true) {
			System.out.println("employee");
		}
		else
			System.out.println("not employee");
	}
	
public static boolean method1(int i) {
	if(i>20 && i<30) {
		return true;
	}
	else 
		return false;
}
public static boolean method2(int j) {
	if(i>=14000 && i<20000) {
		return true;
	}
	else 
		return false;
}

}
	


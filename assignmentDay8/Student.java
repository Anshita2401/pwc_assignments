package assignmentDay8;

public class Student {
	protected int id;
	protected char type;
	protected String name;
	protected int fees;
	protected int feespermonth;
	
	Student(int id){
		this.id=id;
	}

	public Student(int id, char type, String name, int fees, int feespermonth) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.fees = fees;
		this.feespermonth = feespermonth;
	}
	void display() {
		System.out.println("details of Student");
		
	}
	

}

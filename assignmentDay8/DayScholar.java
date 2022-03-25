package assignmentDay8;

public class DayScholar extends Student{
	public DayScholar(int id, char type, String name, int fees, int feespermonth) {
		super(id, type, name, fees, feespermonth);
		// TODO Auto-generated constructor stub
	}

	private String address;

	public DayScholar(int id, char type, String name,int fees ,String address) {
		super(id);
		this.address = address;
	}
	void display() {
		System.out.println("details of day scholar");
	}

}

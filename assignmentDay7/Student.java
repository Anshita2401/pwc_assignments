package assignmentDay7;

public class Student {
	protected int studentId;
	protected String studentType;
	protected String studentName;
	protected String firstName;
	protected String lastName;
	protected String residentialStatus;
	protected double feesPerMonth;
	public Student() {
		super();
	}
	public Student(int studentId, String studentType, String firstName, String lastName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.feesPerMonth = feesPerMonth;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return firstName+lastName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getFees() {
		return getFees();
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth=semesterFees/6.0;
		System.out.println("Fees is "+ feesPerMonth);
	}
	public void calculateFees(double semesterFees,double hostleFees) {
		feesPerMonth=semesterFees/6.0;
		feesPerMonth=feesPerMonth+hostleFees;
		System.out.println("Fees is "+feesPerMonth);
	}
	
}
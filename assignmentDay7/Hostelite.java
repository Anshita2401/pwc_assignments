package assignmentDay7;

public class Hostelite extends Student {
	String hostelName;
	int roomNumber;
	public Hostelite() {
		super();
	}
	public Hostelite(int studentId, String studentType, String firstName, String lastName, double feesPerMonth,
			String hostelName, int roomNumber) {
		super(studentId, studentType, firstName, lastName, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Hostelite [hostelName=" + hostelName + ", roomNumber=" + roomNumber + ", studentId=" + studentId
				+ ", studentType=" + studentType + ", studentName=" + studentName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", feesPerMonth=" + feesPerMonth + ", getHostelName()=" + getHostelName()
				+ ", getRoomNumber()=" + getRoomNumber() + ", getStudentId()=" + getStudentId() + ", getStudentType()="
				+ getStudentType() + ", getStudentName()=" + getStudentName() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getFeesPerMonth()=" + getFeesPerMonth() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		Hostelite hs=new Hostelite(101,"Hostler","K","Chinmayee",35000,"Candy",106);
		System.out.println(hs.toString());
	}
}

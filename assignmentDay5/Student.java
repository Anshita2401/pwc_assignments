package assignmentDay5;

public class Student {
	int id;
	String type;
	String fname;
	String lname;
	public Student() {
		super();
		this.id = id;
		this.type = type;
		this.fname = fname;
		this.lname = lname;
	} 
        String setsName(String fname,String lname){ 

	 	 	 	String sName = fname+lname; 
	 	 	 	return sName;
        }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		} 
	public static void main(String[] args) {
		Student s1=new Student();
		s1.fname="anshita";
		s1.lname="kapoor";
		s1.id=21;
		
		System.out.println(s1);
		
	}	

}

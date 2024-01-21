package BasicOOPS;

public class Student {
	private String name;
	private int enrollmentNumber;
	public void setName(String candidate) {
		this.name=candidate;
	}
	public void setEnroll(int roll) {
		this.enrollmentNumber=roll;
	}
	public void intro() {
	System.out.print(name);
	System.out.print("  ");
	System.out.println(enrollmentNumber);
	}
	

}

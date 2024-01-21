package Inheritence;

public class Student_Details {
	int Studentroll;
	String name;
	int sec;
	int mob;
	String email;
	final String Nation="Indian";
	private final String type="Love Marriage";
	public void info_student(){
		System.out.println("Student Details: "+name+" "+Studentroll+" "+sec+" "+mob+" "+email+" "+Nation+" "+type);
	}
	public void ShowName() {
		System.out.println("Student Name: "+name);
	}
	public void ShowRoll() {
		System.out.println("Roll No. : "+Studentroll);

	}
	public void ShowSection() {
		System.out.println("Section : "+sec);
	}
	public void ShowMob() {
		System.out.println("Mobile No:"+mob);
	}
	public void ShowEmail() {
		System.out.println("Email: "+email);
	}
}

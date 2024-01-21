package Inheritence;

public class Parents_show extends Parents_Details{
	public void info_parents(){
		System.out.println("Parents Details: "+FatherName+" "+MotherName+" "+Address+" "+Occupation+" "+Mobile+" "+Phone+" "+income+" "+Category);
	}
	public void info() {
		info_student();
		info_parents();
	}
}

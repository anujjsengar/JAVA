package Inheritence;

public class Student_Add {
	public static void main(String args[]) {
		Student_Details Student=new Student_Details();
		Student.name="Anuj Kumar";
		Student.Studentroll=17;
		Student.mob=885998;
		Student.email="anuj.kumar_cs.aiml22@gla.ac.in";
		Student.sec=3;
		Student.info_student();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Student.ShowName();
		Student.ShowRoll();
		Student.ShowSection();
		Student.ShowMob();
		Student.ShowEmail();
	}
}

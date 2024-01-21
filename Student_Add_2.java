package Inheritence;

public class Student_Add_2 extends Student_Details {

	public static void main(String[] args) {
		Student_Add_2 Student=new Student_Add_2();
		Student.name="Lovely Sengar";
		Student.mob=843996;
		Student.email="sengarlovely42@gmail.com";
		Student.sec=3;
		Student.Studentroll=17;
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

package Inheritence;

public class Student_Record extends Parents_show{

	public static void main(String[] args) {
		Student_Record s1=new Student_Record();
		Student_Record s2=new Student_Record();
		s1.name="Anuj Sengar";
		s2.name="Lovely Sengar";
		s1.FatherName="Arvind Sengar";
		s2.FatherName="Harendra Sengar";
		s1.MotherName="Manorma Devi";
		s2.MotherName="Lajja Devi";
		s1.Occupation="Farmer";
		s2.Occupation="Farmer";
		s1.Category="General";
		s2.Category="General";
		s1.Address="Nagla Al";
		s2.Address="Nagla Adu";
		s1.income=60000;
		s2.income=60000;
		s1.Mobile=7895;
		s2.Mobile=7830;
		s1.Phone=8954;
		s2.Phone=8954;
		s1.mob=8859;
		s2.mob=8439;
		s1.Studentroll=282504;
		s2.Studentroll=282504;
		s1.email="kumar.anuj.28082004@gmail.com";
		s2.email="sengarlovely42@gmai.com";
		System.out.println();
		System.out.println();
		System.out.println("GROOM SIDE");
		s1.info();
		System.out.println();
		System.out.println();
		System.out.println("BRIDE SIDE");
		s2.info();
	}

}

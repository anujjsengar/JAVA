package OOP;

public class Family {
	String Name;
	String Relation;
	void print() {
		System.out.println("Name:"+Namew);
		System.out.println("Relation:"+Relation);
		System.out.println();
		System.out.println();
		System.out.println();
		                                              }
	public static void main(String args[]){
		Family m1=new Family();
		m1.Name="Rampal Singh";
		m1.Relation="Dada Jii";
		Family m2=new Family();
		m2.Name="Arvind Kumar";
		m2.Relation="Father";
		Family m3=new Family();
		m3.Name="Manorma Devi";
		m3.Relation="Mother";
		Family m4=new Family();
		m4.Name="Deepak Kumar";
		m4.Relation="Brother";
		Family m5=new Family();
		m5.Name="Bharti Kumari";
		m5.Relation="Bhabhi";
		Family m6=new Family();
		m6.Name="Lovely Sengar";
		m6.Relation="Wife";
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
	}

}

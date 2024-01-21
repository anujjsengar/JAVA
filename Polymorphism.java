package Inheritence;

public class Polymorphism {
	int a;
	int b;
	public void adder(int a,int b) {
		System.out.println(a+b);
		}
	public void adder(int a,int b,int c)
	{
		System.out.println(a+b+c);	
	}
	public void adder(int a,int b,double c)
	{
		System.out.println(a+b+c);	
	}
	public void over() {
		System.out.println("Polymorphism");
	}
	public static void main(String args[]) {
		Polymorphism x=new Polymorphism();
		x.adder(10,15,23);
		x.adder(10,15);
		x.adder(13,12,1000000000);
		x.adder(112,343,23);
	}
}

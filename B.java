package BasicOOPS;

public class B extends A {
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void main(String args[]) {
		B b=new B();
		b.mul(12,6);
		b.add(12,6);
	}

}

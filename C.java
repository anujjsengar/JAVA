package BasicOOPS;

public class C extends B{
	public void div(int x,int y) {
		System.out.println(x/y);
	}
	public static void main(String args[]) {
		//Multilevel Inheritence
		C x=new C();
		x.add(5, 4);
		x.mul(23,2);
		x.div(5,2);
	}

}

package Recurssion;

public class product_number {
	public static int prod(int a,int b) {
		if(b==0 || a==0) {
			return 0;
		}
		return a+prod(a,b-1);
	}
	public static void main(String args[]) {
		System.out.print(prod(0,10));
	}

}

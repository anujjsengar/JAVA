package Recurssion;

public class print {
	public static void output(int n) {
		if(n==0) {
			return;
		}
		output(n-1);
		System.out.println(n);
	}
	public static void main(String args[]) {
		output(10);
	}

}

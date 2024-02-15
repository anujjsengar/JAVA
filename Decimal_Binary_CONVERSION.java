package Recurssion;

public class Decimal_Binary_CONVERSION {
	public static void convert(int n) {
		if(n/2==1) {
			System.out.print(1);
			return;
		}
		convert(n/2);
		System.out.print(n%2);
	}
	public static void main(String args[]) {
		convert(5);
	}
}

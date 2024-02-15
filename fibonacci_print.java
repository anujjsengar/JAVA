package Recurssion;

public class fibonacci_print {
	public static int print_fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int x=print_fibo(n-1)+ print_fibo(n-2);
		System.out.print(x+" ");
		return 0;
	}
	public static void main(String args[]) {
		print_fibo(5);
	}

}

package Recurssion;

public class Print_Number {
	public static void print_forward(int n) {
		if(n==0){
			return ;
		}
		print_forward(n-1);
		System.out.print(n+" ");
}
	public static void print_rev(int n) {
		if(n==0){
			return ;
		}
		System.out.print(n+" ");
		print_rev(n-1);
}
	public static void main(String args[]) {
		print_forward(11);
		System.out.println();
		print_rev(11);
		}
	}
	

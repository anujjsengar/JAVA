package Recurssion;

public class Product_array {
	public static int prod(int[] arr,int n) {
		if(n<0) {
			return 1;
		}
		return arr[n]*prod(arr,n-1);
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3};
		System.out.print(prod(arr,arr.length-1));
	}

}

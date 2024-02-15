package Recurssion;

public class Mean_Array {
	public static int mean(int[] arr,int n) {
		if(n==0) {
			return 0;
		}
		return arr[n-1]/n + mean(arr,n-1);
	}
	public static void main(String args[]) {
		int []arr= {1,2,3};
		System.out.println(mean(arr,arr.length));
	}

}

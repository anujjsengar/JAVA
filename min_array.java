package Recurssion;

public class min_array {
	public static int min(int[] arr,int n,int m) {
		if(n==0) {
			return 0;
		}
		if(m>arr[n-1])
			m=arr[n-1];
		return min(arr,n-1,m);
	}
	public static void main(String args) {
		int[] arr= {1,2,3};
		System.out.println(min(arr,arr.length,arr[-1]));
	}

}

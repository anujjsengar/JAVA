package Recurssion;

public class LinearSearch_check {
	public static boolean search(int arr[],int target,int i) {
		if(arr[i]==target) {
			return true;
		}
		if(i==arr.length-1) {
			return false;
		}
		return search(arr,target,i+1);
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=5;
		System.out.println(search(arr,target,0));
	}

}

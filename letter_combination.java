package Recurssion;

public class letter_combination {
	static  String [] arr= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void combine(String digits,String ans,String[] arr) {
		if(digits.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=digits.charAt(0);
		int k=ch-48;
		String queue= arr[k-1];
		for(int i=0;i<queue.length();i++) {
			combine(digits.substring(1),ans+queue.charAt(i),arr);
		}
	}
	public static void main(String args[]) {
		String digit="23";
		combine(digit,"",arr);
	}
}

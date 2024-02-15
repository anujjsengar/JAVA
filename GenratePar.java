package Recurssion;

public class GenratePar {
	public static void print(int n,int open,int close ,String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open<n) {
			print(n,open+1,close,ans+"(");
		}
		if(open>close) {
			print(n,open,close+1,ans+")");
		}
	}
	public static void main(String args[]) {
		print(4,0,0,"");
	}
}

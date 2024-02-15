package Recurssion;

public class lexographical_count {
	public static void count(int n,int ans) {
		if(ans<=n) {
			System.out.println(ans);
		}
		if(ans>n) {
			return ;
		}
		int i=0;
		if(ans==0) {
			i=1;
		}
		for(;i<=9;i++) {
			count(n,ans*10+i);
			}
		
	}
	public static void main(String args[]) {
		int n=25;
		count(n,0);
	}

}

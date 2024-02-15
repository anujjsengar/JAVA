package Recurssion;

public class lexographical_count_2 {
	public static void count(int n,int ans) {
		if(ans<=n) {
			System.out.println(ans);
		}
		if(ans>n) {
			return ;
		}
		for(int i=0;i<=9;i++) {
			count(n,ans*10+i);
			}
		
	}
	public static void main(String args[]) {
		int n=25;
		for(int i=1;i<=9;i++)
			count(n,i);
	}

}

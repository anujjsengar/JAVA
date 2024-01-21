package LECTURES;

public class p_15 {
	public static void main(String[] args) {
		int n=5;
		int nsp=0;
		int nst=n;
		for(int i=0;i<9;i++) {
			for( int j=1;j<=nsp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=nst;nst++) {
				System.out.print("* ");
			}
			if(i<=5) {
				nsp=nsp+2;
				nst--;
			}
			else {
				nsp=nsp-2;
				nst++;
			}
			System.out.println();		
		}
	}

}

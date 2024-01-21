package LECTURES;

public class p_27 {

	public static void main(String[] args) {
		int n=5;
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			int val=1;
			for(int i=1;i<=nsp;i++) {
				System.out.print(" ");			}
		for(int j=1;j<=nst;j++) {
			System.out.print(val);
		
		if(j<row) {
			val++;
		}
		else {
			val--;
		}

	}

}
}
}
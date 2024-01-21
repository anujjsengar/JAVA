package LECTURES;

public class p_13 {
	package LECTURES;

	public class p_9 {
		public static void main(String[] args) {

					int n=5;
					int nsp=(2*n)-1;
					int nst=0;
					for(int i=0;i<n;i++) {
						for(int j=0;j<=nst;j++) {
							System.out.print("*");
						}
						for(int j=1;j<=nsp;j++) {
							System.out.print("  ");
						}
						nsp=nsp-1;
						nst++;
						System.out.println();
					}

	}


}

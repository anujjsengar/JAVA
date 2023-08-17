import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int nsp=n-1;
        for(int x=1;x<=n;x++){
            for(int i=1;i<=nst;i++){
                System.out.print(i);
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("*");
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}

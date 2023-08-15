import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=n;
        int nsp=0;
        int val=n;
        for(int i=1;i<=2*n+1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
                }
            for(int k=1;k<=nst;k++){
                System.out.print(val);
                System.out.print(" ");
                if(k==nst){
                    continue;
                }
                else{
                    val=val-1;
                }
            }
            System.out.print(0);
            System.out.print(" ");
            for(int m=1;m<=nst;m++){
                System.out.print(val);
                System.out.print(" ");
                val=val+1;
            }
            if(i<n+1){
                nst--;
                nsp++;
                val=nst;
            }
            else{
                nst++;
                nsp--;
                val=nst;
            }
        System.out.println();
        }
    }
}

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int nsp=2*n-1;
        int val=n;
        int row=2*n+1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(val);
                System.out.print(" ");
                if(j==nst){
                    continue;
                }
                else{
                    val--;
                }
            }
            if(i==n+1){
                System.out.print(0);
                System.out.print(" ");
            }
            else{
                for(int k=1;k<=nsp;k++){
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=nst;j++){
                System.out.print(val);
                System.out.print(" ");
                val=val+1;
            }
            System.out.println();
            val=n;
            if(i<n){
                nst++;
                nsp=nsp-2;
            }
            if(i>n+1){
                nst--;
                nsp=nsp+2;
            }
        }
    }
}

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
            System.out.print(x);
            System.out.print(" ");
            x=x+1;
            }
        nst++;
        x=1;
        System.out.println();
        }
    }}

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int val1=0;
        int val2=1;
        int val=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(val);
                System.out.print("    ");
                val1=val2;
                val2=val;
                val=val1+val2;
                }
                System.out.println();
            nst++;
        }
            
        }}

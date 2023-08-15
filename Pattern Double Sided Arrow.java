import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp1=n-1;
        int nsp2=-1;
        int nst=1;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(val);
                System.out.print(" ");
            if(j==nst){
                continue;
            }
            else{
                val=val-1;
            }
            }
            for(int m=1;m<=nsp2;m++){
                System.out.print("  ");
            }
            for(int q=1;q<=nst;q++){
                if(nst==1){
                    continue;
                }
                else{
                System.out.print(val);
                System.out.print(" ");
                val=val+1;
                }
            }
            
            if(i<(n+1)/2){
                val=i+1;
                nst++;
                nsp1=nsp1-2;
                nsp2=nsp2+2;
            }
            else{
                val=val-2;
                nst--;
                nsp1=nsp1+2;
                nsp2=nsp2-2;
            }
            
            System.out.println();
            
        }}}
            

        

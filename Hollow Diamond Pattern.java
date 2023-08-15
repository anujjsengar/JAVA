import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=-1;
        int nst1=(n+1)/2;
        int nst2=(n+1)/2-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst1;j++){
                System.out.print("*	");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("        ");
            }
            for(int j=1;j<=nst2;j++){
                System.out.print("*	");
            }
            System.out.println();
            if(i<(n+1)/2){
                nsp=nsp+2;
                nst1--;
                if(i==1){
                    nst2=nst2;
                }
                else{
                    nst2--;
                }
            }
            else{
                nsp=nsp-2;
                nst1++;
                if(i==n-1){
                    nst2=nst2;
                }
                else{
                    nst2++;
                }
            }
        }
    }
}

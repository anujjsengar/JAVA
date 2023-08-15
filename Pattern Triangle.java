import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int val=1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("       ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print(val);
                System.out.print("      ");

                if(k<i){
                val=val+1;
                }
                else{
                    val--;
                }
            }
            val=i+1;
            nst=nst+2;
            nsp--;
            System.out.println();
        }
    }
}

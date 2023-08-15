import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=n;
        for(int x=1;x<=n;x++){
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            if(x!=1 && x!=n){
                System.out.print("* ");
                for(int q=1;q<=2;q++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                for(int j=1;j<=nst;j++){
                    System.out.print("*");
                }
            }
        System.out.println();
        nsp--;
        }
    }
}

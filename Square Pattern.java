import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i);
                    System.out.print(" ");
                }
                else{
                    x=x+1;
                    System.out.print(x);
                    System.out.print(" ");
                }
            }
            x=i+1;
            System.out.println();
        }
    }
}

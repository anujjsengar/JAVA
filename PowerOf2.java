package Recurssion;

public class PowerOf2 {
	public static boolean isPowerOfTwo(int n) {
		if(n/3==0 && n>2){
            return true;
        }
        if(n%3!=0 || n<3){
            return false;
        }
        return isPowerOfTwo(n/3); 
    }
	public static void main(String args[]) {
		System.out.println(isPowerOfTwo());
	}

}

package Abstract;

public class Exception_Handling {
	public static void main(String args[]) {
	int a=10;
	int b=0;
	int c=0;
	try {
		c=a/b;
	}
	catch(Exception e) {
		System.out.println("Exception Handled\n"+e);
	}
	System.out.println(c);
	}

}

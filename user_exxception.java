package Abstract;

public class user_exxception {
	public static int fact(int n) throws InvalidInputException {
		if (n< 0) {
		InvalidInputException e = new InvalidInputException();
		throw e;
		}
		if (n == 0) {
		return 1;
		}
		return n * fact(n - 1);
		}
	public static void main(String args[]) {
		int n=-1;
		int r=0;
		try {
			r=fact(n);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
			System.out.println(e);
		}
	System.out.println(r);
	}
}

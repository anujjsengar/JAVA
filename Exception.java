package Exception;

public class Exception extends DivByZero {

	public static void main(String[] args) {
		DivByZero obj=new DivByZero();
		obj.Div(10, 0);
	}

}

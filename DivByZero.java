package Exception;

public class DivByZero {
	void Div(int a,int b) {
		try {
			System.out.println(a/b);
		}
		catch(Exception AirthmeticException){
			System.out.println("DivByZero");
		}
	}

}

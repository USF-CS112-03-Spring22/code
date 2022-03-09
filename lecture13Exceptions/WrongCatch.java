public class WrongCatch {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("abc");
			double res = 5.0 / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println("Can't divide by 0.");
		} 
		finally {
 			System.out.println("Executed the finally block.");
 		}
	}

}

public class ArithmeticExceptionDemo {

	public static double divide(int a, int b) {
		double result  =  a / b;
		System.out.println(result);
		return result;
	}

	public static double divideHandleException(int a, int b) {
		try {
			double result  =  a / b;
			System.out.println("Computed the result inside divideHandleException method");
			
			return result;
			//return (float)a / b;
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0.");
			return Double.MAX_VALUE;
		} finally {
			System.out.println("Executed the finally block.");
		}

	}

	public static void main(String[] args) {

		double res = divideHandleException(5, 0);

		System.out.println(res);

	}
}

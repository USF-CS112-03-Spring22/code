public class MethodExamples {
	// Find Bugs
	public static int sumOfThree(int x, int y, int z) {
		int res =  x + y + z;
		return res;
	}

	public static int productOfThree(int x, int y, int z) {
		int res =  x * y * z;
		return res;
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		//int sumRes = sumOfThree(1, 2, 3);
		//System.out.println(sumRes);
		
		System.out.println(sumOfThree(1, 2, 3));

		int res = productOfThree(1, 2, 3);
		System.out.println(res);

	}
}
public class WrapperClassesDemo {
	
	public static void main(String[] args) {

	
		// Using class Integer ---------------

		int minValue = Integer.min(9, 20);
		System.out.println(minValue);

		// Autoboxing
		Integer integerValue1 = 5;
		int intValue2 = new Integer(4); // deprecated
		System.out.println(integerValue1 + " " + intValue2);
		integerValue1 = intValue2;

		// Using parseInt
		int intValue = Integer.parseInt("34");
		int sum = intValue + 10;
		System.out.println(sum);

		// Using MIN_VALUE constant
		int[] arr = {8, -1, 100, 3, -20, 9};
		int res = findMax(arr); 

		
		System.out.println(res);

	}

	public static int findMax(int[] arr) {
		// find max
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
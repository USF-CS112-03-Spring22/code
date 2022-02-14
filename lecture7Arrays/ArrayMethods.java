import java.util.Arrays;

public class ArrayMethods {
	

	public static int computeSum(int[] arr) {
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			sum  = sum + arr[index];
		}

		/*
		// This syntax would also work:
		for (int element: arr) {
			sum  = sum + element;
		} */
		return sum;
	}



	public static double computeAverage(int[] arr) {

		double average = computeSum(arr) / ((double)arr.length);
		
		return average;
	}


	// The following implementation is INCORRECT, it tries to add num to each element of the array, but fails.
	// it would NOT modify the array, do not use!
	public static void addNumberIncorrect(int[] arr, int num) {
		for (int elem: arr) {
			elem = elem + num; 
		}
	}

	public static void addNumber(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			// FILL IN CODE: add num to each element of the array arr
		}
	}

	
	public static int[] addArrays(int[] arr1, int[] arr2) {
		// Assume arrays have the same size
		int[] result = new int[arr1.length];
		// FILL IN CODE


		return result;
	}

	public static void main(String[] args) {

	
		int[] arrInMain = {1, 2, 3, 4, 5};
		int sumOfValues = computeSum(arrInMain);
		System.out.println(sumOfValues);

		double average = computeAverage(arrInMain);
		System.out.println(average); 

		addNumberIncorrect(arrInMain, 10);
		System.out.println(Arrays.toString(arrInMain));
		
		/*
		int[] arr1 = { 1, 2, 3};
		int[] arr2 = {10, 20, 30};

		int[] newArr = addArrays(arr1, arr2); // should contain 11, 22, 33
		System.out.println(Arrays.toString(newArr)); */

	}





}
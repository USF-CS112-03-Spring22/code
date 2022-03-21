import java.util.Arrays;

public class ArrayMethods {
	
	public static void removeElement(int[] arr, int index) {
		if (index < 0 || index >= arr.length)
			throw new IllegalArgumentException();

		// index is valid
		for (int i = index + 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = 0; // can't change the size, so just set the empty element to 0

	}

	public static void main(String[] args) {
		int[] myArray = {4, 1, 9, 3, 2};
		try {
			removeElement(myArray, 10); // index 10 does not exist
		}
		catch (IllegalArgumentException e) {
			System.out.println("Could not remove the element due to invalid index");
		}
		System.out.println(Arrays.toString(myArray));
	}
}
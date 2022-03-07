import java.util.ArrayList;

public class ArrayListExercise {
	
	public static int findMin(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		// FILL IN CODE - iterate over the list and update the min
		

		return min; // change
	}


	public static void changeRadii(ArrayList<Circle> circles, double value) {
		// Add value to the radius of each circle
		// FILL IN CODE
		

	}

	public static void main(String[] args) {

		// Create an ArrayList with several integer values
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(13);
		list.add(-10);
		// call findMin and print the result
		System.out.println(findMin(list));

		// Create an ArrayList of Circles
		ArrayList<Circle> circles = new ArrayList<>();
		Circle c1 = new Circle(5.0);
		circles.add(c1);
		Circle c2 = new Circle(1.5);
		circles.add(c2);
		// call changeRadii
		changeRadii(circles, 2.0);
		System.out.println(circles);
	}
}
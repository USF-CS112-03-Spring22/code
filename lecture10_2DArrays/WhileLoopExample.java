public class WhileLoopExample {
	
	public static void main(String[] args) {

		int count = 1;
		while (count <= 5) {
   			System.out.println(count);
   			count++;
		}

		System.out.println();

		// Nested while:
		int i = 0;
		while (i < 4) {
			int j = 0;
			while (j < 2) {
				System.out.println(i + " " + j);
				j++;
			}
			i++;
		}

	}

}
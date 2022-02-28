public class Patterns {
	
	/** Print a pattern of asterisks, where we have rows number of lines, and cols number of asterisks on each line
	    Example: if rows is 4 and cols is 2, the function should print
	    **
	    **
	    **
	    **
	*/	
	public static void printRectangularPattern(int rows, int cols){
		// FILL IN CODE
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

	/* Print one * in the first line, two asterisks in the second line, three in the third line, ..., rows asterisks in the last line
	   Ex: if rows is 5, the function should print:
	   1   i = 1, j loop should go once
	   12  i = 2, j loop should go twice 
	   123  i = 3, j loop should go three times
	   1234
	   12345
	*/	
	public static void printTriangularPattern(int rows){
		// FILL IN CODE
		for (int i = 1; i <= rows; i++) {  // goes over lines that need to be printed
			for (int j = 1; j <= i; j++) // prints numbers on the line
				System.out.print(j);
			System.out.println(); // goes to the next line
		}

	}

	public static void main(String[] args) {
		// printRectangularPattern(2, 3);

		printTriangularPattern(3);
	}	


}
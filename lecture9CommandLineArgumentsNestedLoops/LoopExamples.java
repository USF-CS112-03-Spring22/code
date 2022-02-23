public class LoopExamples {
	
	public static void main(String[] args) {
		for (int count = 1; count <= 5; count++) 
		   System.out.println(count);
		
		System.out.println();

		// Example of using a break
		for (int count = 1; count <= 5; count++) {
			if (count == 3)
				break;
		   System.out.println(count);
		}
		System.out.println("Done with the for loop");

		// Example of using continue
		for (int count = 1; count <= 5; count++) {
			if (count % 2 == 0)
				continue;
		   System.out.println(count);
		}
		System.out.println("Done with the for loop");

		// Nested loops
		for (int i = 1; i <= 4; ++i) {
	 		System.out.println("i = " + i);
  	 		// inner loop
  	 		for(int j = 1; j <= 2; ++j) {
   				 System.out.println("  j = " + j);
  	  		}	

   		}


	}
}
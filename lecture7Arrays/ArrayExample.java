import java.util.Arrays;

public class ArrayExample
{

   public static void main (String[] args)
   {
      // Create an array of 10 scores
      int[] scores = new int[10];
      scores[0] = 5;
      scores[1] = 10;
      scores[2] = 3;
      scores[3] = 15;
      scores[4] = 1;
      scores[5] = 30;
      scores[6] = 0;
      scores[7] = 8;
      scores[8] = 9;
      scores[9] = 2;
      System.out.println("Number of scores: " + scores.length); // the number of elements in the array
      System.out.println("The first score: " + scores[0]); // the first score      
      scores[0] = 12; // we can change the value; here we change the first score
      System.out.println("The first score after the change: " + scores[0]); // the first score after modification

      // Another way to create and initialize an array
      // int[] scores = {70, 85, 91, 99, 82, 34, 55, 9, 2, 8};

      //System.out.println(scores[10]); // does not exist, Java throws and exception

      // System.out.println(scores); // Will print only the address of the first element of the array

      int randomIndex = (int)(10*Math.random());
      System.out.println("A random score from the array: " + scores[randomIndex]);


      // Three ways to print the elements of the array

      // Option #1: Printing the array using indices
      for (int i = 0; i < scores.length; i++) {
         System.out.print(scores[i] + " ");
      } 
      System.out.println();
      
      // Option #2: Printing the array using a for each loop
      for (int sc : scores)
          System.out.print(sc + " ");
      System.out.println();

      // Option #3: Printing the array using Arrays's toString method
      System.out.println(Arrays.toString(scores)); // Another way to print the array

       // Compute the sum of the elements of the array
      int sum = 0;
      for (int i =0; i < scores.length; i++) {
         sum = sum + scores[i];
      }   
      System.out.println("The sum is " + sum);

      // Assigning/Changing values - we can change the value using the []
      /*for (int i = 0; i < scores.length; i++) {
         scores[i] = i;
      }  
      System.out.println(Arrays.toString(scores));
      */

      
      // Trying to change the array to become 0, 1, 2, 3, 4 using a for each loop - won't work!
      /*int k = 0;
      for (int sc : scores) { // Does not change the array! Because sc is just a copy of each cell of the array.
          sc = k;  // This will NOT change the actual element in the array
          k++;
      }
      System.out.println(Arrays.toString(scores));
      */
      


   }
}

//********************************************************************
//  TwoDArray.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class TwoDArray
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      // Simple example first:
      int[][] grades = new int[4][3];

      // first row
      grades[0][0] = 93;
      grades[0][1] = 84;
      grades[0][2] = 87;

      // second row
      grades[1][0] = 60;
      grades[1][1] = 95;
      grades[1][2] = 77;

      // third row
      grades[2][0] = 99;
      grades[2][1] = 98;
      grades[2][2] = 73;

      // fourth row
      grades[3][0] = 75;
      grades[3][1] = 77;
      grades[3][2] = 78;

      // TODO: print the array
      // Iterate using indices
      System.out.println("Array printed using indices: ");
      for (int i = 0; i < grades.length; i++) {
         for (int j = 0; j < grades[i].length; j++) {
            System.out.print(grades[i][j] + " ");
         }
         System.out.println();
      }


      System.out.println();
      System.out.println("Array printed using a for each loop:");

      // Iterate using a for each loop
      // TODO: print the array
      for (int[] row: grades) {
         for (int value: row) {
            System.out.print(value +  " ");
         }
         System.out.println();
      }

       /*
      // Slightly more complicated example:
      int[][] table = new int[5][10];

      // Load the table with values
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;

      // Print the table
      for (int row=0; row < table.length; row++)
      {
         for (int col=0; col < table[row].length; col++)
            System.out.print (table[row][col] + "\t");
         System.out.println();
      } */

      // Can also use an initializer list
      // int[][] gradesInitializerList = {{93, 84, 87}, {60, 95, 77}, {99, 98, 73}, {75, 77, 78};

      /*
      // Rows can have a variable length
      int[][] gradesVariableLength = new int[4][];
      gradesVariableLength[0] = new int[2]; // {78, 89};  // Or can use an initializer list here
      gradesVariableLength[1] = new int[4];
      gradesVariableLength[2] = new int[2];
      gradesVariableLength[3] = new int[3];
      */


   }
}

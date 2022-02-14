//********************************************************************
//  BasicArray.java       Author: Lewis/Loftus
//
//  Demonstrates basic array declaration and use.
//********************************************************************

public class BasicArray
{
   //-----------------------------------------------------------------
   //  Creates an array, fills it with various integer values,
   //  modifies one value, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      // Create an array of 15 values that are multiplies of 10.

      final int LIMIT = 15, MULTIPLE = 10;

      int[] list = new int[LIMIT];
      
      //  Initialize the array values
      for (int index = 0; index < LIMIT; index++)
         list[index] = index * MULTIPLE;
      
      // A for each loop to print the values
      for (int value : list) {
         System.out.print (value + "  ");
      }
      System.out.println();
         
   }
}

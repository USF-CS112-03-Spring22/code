//********************************************************************
//  SodaSurveyUpdated.java       Original Author: Lewis/Loftus
//
//  Modified from the SodaSurvey example by Lewis and Loftus.
//  Demonstrates the use of a two-dimensional array.
//********************************************************************


public class SodaSurveyUpdated
{
    public static void main (String[] args)
   {
    // Consider the following 2D array where we store user ratings for 4 soda drinks.
    // Each row corresponds to one type of the soda drink (say, the first row is for Pepsi, the second row for Sprite etc).
    // 10 people rated each soda drink from 1 to 5 (1 means poor, 5 means great).

      int[][] scores = { {3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
                         {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
                         {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
                         {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} };

      final int SODAS = scores.length;
      final int PEOPLE = scores[0].length;

      // FILL IN CODE: print the scores array to the console

      int[] personAverage = new int[PEOPLE];
      // Fill in array personAverage that stores an average rating per USER
      // For instance for the first user, the ratings for the 4 drinks are  3, 2, 3, 1. The average for this user
      // would be 2.25
      // Print personAverage array values to the console
      // FILL IN CODE

      // Now find the person with the highest average score and print the id of the drink she/he rated the highest
      // FILL IN CODE

      
   }
}

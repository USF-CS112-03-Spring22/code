//********************************************************************
//  SodaSurvey.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

import java.text.DecimalFormat;

public class SodaSurvey
{
   //-----------------------------------------------------------------
   //  Determines and prints the average of each row (soda) of the survey scores.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      // We have 4 soda drinks; each was rated by 10 people:
      // The first row contains ratings of the first soda by 10 people, the second row contains ratings of the second soda etc.
      int[][] scores = { {3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
                         {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
                         {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
                         {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} };


      final int SODAS = scores.length;
      final int PEOPLE = scores[0].length;

      int[] sodaSum = new int[SODAS];

      for (int soda=0; soda < SODAS; soda++)
         for (int person=0; person < PEOPLE; person++)
         {
            sodaSum[soda] += scores[soda][person]; // sum of all the ratings for this soda drink
         }

      System.out.println ("Averages:\n"); // average for each soda drink

      for (int soda=0; soda < SODAS; soda++)
         System.out.println ("Soda #" + (soda+1) + ": " + (float)sodaSum[soda]/PEOPLE);

      
   }
}

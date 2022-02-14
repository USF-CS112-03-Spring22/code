//********************************************************************
//  GradeRange.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of objects.
//********************************************************************

import java.util.Scanner;
import java.util.Arrays;


public class GradeRange
{
   //-----------------------------------------------------------------
   //  Creates an array of Grade objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      Grade[] grades = new Grade[3];
      Scanner sc = new Scanner(System.in);

      int currIndex = 0;

      for (int i = 0; i < 3; i++) {
         System.out.println("Enter grade: ");
         String name = sc.next();
         int lowerBound = sc.nextInt();

         Grade grade = new Grade(name, lowerBound);
         grades[currIndex] = grade;

         // Can combine two lines before this one into one:
         // grades[currIndex] = new Grade(name, lowerBound);

         currIndex++;
      }


     System.out.println();
     // for each loop
      for (Grade g: grades) {
         System.out.println(g);
      }
      //grades[0] = new Grade("A", 94);
      //grades[1] = new Grade("B", 84);
      //grades[2] = new Grade("B+", 87);

      changeGrades(grades, 2);
      System.out.println(Arrays.toString(grades));


      /*
      // Using an initializer list for array of objects
      Grade[] grades =
      {
         new Grade("A", 95), new Grade("A-", 90),
         new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
         new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
         new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
         new Grade("F", 0)
      };

      for (Grade letterGrade : grades)
        System.out.println (letterGrade);
      */
   }

  /**
  * Changes the lower bound for each grade by adding num.
  */
   public static void changeGrades(Grade[] grades, int num) {
      for (int i = 0; i < grades.length; i++) {
         Grade grade = grades[i];
         grade.setLowerBound(grade.getLowerBound() + num);

      }
   }
}

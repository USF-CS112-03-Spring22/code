//********************************************************************
//  Beatles.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;

public class Beatles
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      ArrayList<String> band = new ArrayList<>();

      band.add("Paul");
      band.add("Pete");
      band.add("John");
      band.add("George");

      //System.out.println(band);
      //System.out.println(band.get(1));
      //System.out.println(band.size());

      //int location = band.indexOf("Pete");
      //band.remove(0);

      //System.out.println(band);

      // We can iterate over the ArrayList and print each element using indices
      for (int i = 0; i < band.size(); i++) {
         System.out.println(band.get(i));
      }

      System.out.println();
      
      // We can also iterate over the ArrayList and print each element using a for each loop
      for (String name: band) {
         System.out.println(name);
      }

      /*
      System.out.println("At index 1: " + band.get(1));
      band.add(2, "Ringo");

      System.out.println("Size of the band: " + band.size());
      int index = 0;
      while (index < band.size())
      {
         System.out.println(band.get(index));
         index++;
      } */
      
      // Iterating with a for loop
      // FILL IN CODE
   }
}

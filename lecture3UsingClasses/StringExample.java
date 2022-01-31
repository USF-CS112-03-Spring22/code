import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        //declare a string reference
        String s1;
        // point it to an object
        s1 = new String("Luke Skywalker");

        // We can also combine the two lines
        String s2 = new String("Yoda");
    

        // For strings, we can actually omit the new keyword
        // since it is such a commonly used class
        String s3 = "Darth Vader";

        // Calling methods on strings
        int length = s1.length(); // length of the string
        System.out.println(length);

        char firstLetter = s1.charAt(0); // first letter of string s1
        System.out.println(firstLetter);

        if (s2.endsWith("a"))
            System.out.println("String s2 ends with an a");

        // Use .equals to compare strings (do not use == to compare strings! )
        if (s1.equals(s2)) {
            System.out.println("Yoda is the same as Luke Skywalker. Wait, what??");
        }
        System.out.println(s3.toLowerCase());
        // note: s3 will not change! toLowercase method will return a new string in lowercase

        // Demonstrates concatenation using + operator
        String s = s2 + " is pretty cool, but so is " + s3;
        System.out.println(s); 


    }

    public static void checkUsername() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username");
        // FILL IN CODE

    }
        
}

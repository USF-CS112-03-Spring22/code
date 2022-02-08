import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        //declare a string reference
       /* String s1;
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

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        if (s2.endsWith("a"))
            System.out.println("String s2 ends with an a");

        // Use .equals to compare strings (do not use == to compare strings! )
        if (s1.equals(s2)) {
            System.out.println("Yoda is the same as Luke Skywalker. Wait, what??");
        }

        // s3.toLowercase(); // does not change s3
        s3 = s3.toLowercase(); // will change s3
        

        System.out.println(s3.toLowerCase());
        // note: s3 will not change! toLowercase method will return a new string in lowercase

        // Demonstrates concatenation using + operator
        String s = s2 + " is pretty cool, but so is " + s3;
        System.out.println(s);  */

        checkUsername();



    }

    public static void checkUsername() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username");
        String str = sc.nextLine();

        /*if (str.length() < 5) {
            System.out.println("Too short");
            return;
        }
        //if (str.charAt(0) != '-') {
        if (!str.startsWith("-")) {
             System.out.println("Does not start with a dash");
             return;   
        }

        boolean foundA = false;

        v

        if (foundA) {
            System.out.println("The username is fine.");
        }
        else
            System.out.println("The username does not contain an a");
         */   


        // FILL IN CODE
        if (!checkLength(str))
            return;  

        if (!checkFirstLetter(str, "-"))
            return;  

        if (!checkIfContainsLetter(str, 'a'))
            return;

        System.out.println("Username is ok");

    }

    public static boolean checkLength(String str) {
        if (str.length() < 5) {
            System.out.println("Too short");
            return false;
        }
        return true;
    }

    public static boolean checkFirstLetter(String str, String characterWeWant) {
        if (!str.startsWith(characterWeWant)) {
             System.out.println("Does not start with the character we expect");
             return false;   
        }
        return true;
    }

    public static boolean checkIfContainsLetter(String str, char letter) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                return true;
            }
        }
        System.out.println("Did not find the given letter");
        return false;
    }
        
}


/** A class that demonstrates how to use class Die.
 * From the book by Lewis and Loftus, Java Software solutions.
 * */
public class RollingDice {
    public static void main(String[] args) {
        // Create two dice and roll them
        Die die1  = new Die(5); // constructor with an argument with be invoked
        Die die2  = new Die(); //default constructor will be invoked
        die1.roll();
        die2.roll();
       
        System.out.println(die1.getFaceValue());
	System.out.println(die2.getFaceValue());

    }
}

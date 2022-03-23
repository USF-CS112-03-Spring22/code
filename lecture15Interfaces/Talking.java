/** The main class for the Speak/GameCharacter example that demonstrates how default methods work */
public class Talking {
    public static void main(String[] args) {
        GameCharacter c1 = new GameCharacter();
        c1.say("Hello");
        // c.shout();

        GameCharacter c2 = new GameCharacter();
        c2.say("How are you doing?");

    }
}

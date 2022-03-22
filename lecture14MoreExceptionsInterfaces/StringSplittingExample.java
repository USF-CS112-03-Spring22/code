public class StringSplittingExample {
	
	public static void main(String[] args) {
		/*String s  = "Cody; lasVegas$; Jenny, Helen, Xiaofeng, Bill";

		String[] words = s.split("; ");
		for (String word: words) {
			System.out.println(word);
		}
		String name = words[0];
		System.out.println("Name is " + name);

		String allFriends = words[2];
		System.out.println("All friends in one line " + allFriends);
		// Now we could split the allFriends string using ", " to get individual friends
		// TODO
		*/

		// Different example of splitting a string
		String seasons  = "winter spring summer fall";

		String[] seasonWords = seasons.split(" ");
		for (int i = 0 ; i < seasonWords.length; i++) {
			System.out.println(seasonWords[i]);
		}


	}
}
public class Username {
	// Creates a username by concatenating the command line arguments provided by the user

	public static void main(String[] arguments) {
		String username = "";

		if (arguments.length > 0 ) {

			for (int  i = 0; i < arguments.length; i++) {
				 username  = username + arguments[i];

			}


		}
		System.out.println("Your username is " + username);

		
		// Converting a string to an integer
		/*String s = "123";
		int x = Integer.parseInt(s);
		System.out.println(x); */

	}


}

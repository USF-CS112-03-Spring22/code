import java.util.*;

public class AlienExample {
	public static void main(String[] args) {

		AlienX alien1 = new AlienX();
		AlienY alien2 = new AlienY();
		alien1.move();
		alien2.move();
		System.out.println(alien1);
		System.out.println(alien2);

		/*
		// Since both AlienX and AlienY implement a Moveable interface, we can 
		// treat them both as Moveable-s:
		ArrayList<Moveable> aliens = new ArrayList<>();
		aliens.add(new AlienX());
		aliens.add(new AlienY());

		for (int i = 0; i < aliens.size(); i++) {
			// move each alien twice
			aliens.get(i).move();
			aliens.get(i).move();
			System.out.println(aliens.get(i)); // print info about x, y coordinates of the alien
		}
		*/

	}

}
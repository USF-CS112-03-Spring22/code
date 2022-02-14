public class Calculator {
	private int total;

	public Calculator() {
	  total = 0;
	}

	public void add(int x) {
		total += x; // reminder: this is the same as total = total + x
	}

	public void substract(int x) {
		total -= x;
	}

	public void multiply(int x) {
		total *= x;
	}

	public void divide(int x) {
		total /= x;
	}

	public int getResult() {
		return total;
	}

}
import java.util.Random;

public class Guesses {

	public static void main(String[] args) {
		makeGuesses();

	}

	public static void makeGuesses() {
		Random rand = new Random();
		// get the number
		int guess = 0;
		int numOfGuesses = 0;

		while (guess < 48) {
			guess = rand.nextInt(49) + 1;
			numOfGuesses++;
			System.out.println("guess = " + guess);
			
		}
		System.out.println("total guesses = " + numOfGuesses);
	}

}
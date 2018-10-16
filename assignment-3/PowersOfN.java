
public class PowersOfN {

	public static void main(String[] args) {
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);

	}

	public static void printPowersOfN(int num, int count) {
		for (int i = 0; i <= count; i++) {
			double power = Math.pow(num, i);
			System.out.print((int) power + " ");
		}

		System.out.println();
	}

}
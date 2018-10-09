//Print 
// 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55  + 89
public class FibonacciNumbers {

	public static void main(String[] args) {
		fibonacciCalculation();

	}

	public static void fibonacciCalculation() {
		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i < 12; i++) {
			System.out.print(a + " ");
			c = a + b;// sum of first two variables
			a = b; // current number
			b = c; // temporary number
		}

	}

}

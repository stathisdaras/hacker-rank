package algorithms.implementation;

public class SherlockAndSquare {

	public static void main(String[] args) {

		for (int i = 1; i < args.length; i = i + 2) {
			int A = i;
			int B = i + 1;
			int squareNumbers;
			while (A <= B) {
				squareNumbers = 0;
				if (isSquareNumber(A)) {
					squareNumbers++;
				}
				A++;
			}
			System.out.println(squareNumbers);
		}
	}

	private static boolean isSquareNumber(int number) {
		double root = Math.sqrt(number);
		return isInteger(root);
	}

	private static boolean isInteger(double root) {
		return ((root == Math.floor(root)) && !Double.isInfinite(root));
	}
}

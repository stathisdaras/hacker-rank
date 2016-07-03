package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndSquare {

	public static void main(String[] args) throws IOException {

		// for every row [A, B] find sum of square numbers
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// first row is the number of rows
		br.readLine();
		String input;

		while ((input = br.readLine()) != null) {
			String[] testCases = input.split(" ");

			Double A = Double.parseDouble(testCases[0]);
			Double B = Double.parseDouble(testCases[1]);

			int difference = (int) (Math.sqrt(B) - Math.sqrt(A));

			if (isSquareNumber(B)) {
				difference++;
			}

			if (!isSquareNumber(B) && !isSquareNumber(A) && difference != 0) {
				difference++;
			}

			System.out.println(difference);
		}
	}

	// if the square root of a number is an integer then it is a square number
	private static boolean isSquareNumber(Double number) {
		double root = Math.sqrt(number);
		return isInteger(root);
	}

	// a number is integer if it equals its rounded value
	private static boolean isInteger(double root) {
		return ((root == Math.floor(root)) && !Double.isInfinite(root));
	}
}

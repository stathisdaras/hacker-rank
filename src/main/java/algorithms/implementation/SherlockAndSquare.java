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

		// for every line compute  the square numbers between sqrt(A) and sqrt(B) (efficient)
		while ((input = br.readLine()) != null) {
			String[] testCases = input.split(" ");

			Double A = Double.parseDouble(testCases[0]);
			Double B = Double.parseDouble(testCases[1]);

			int difference = (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);

			System.out.println(difference);
		}
	}
}

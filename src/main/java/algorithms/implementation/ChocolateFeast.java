package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateFeast {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// first row is the number of test cases
		br.readLine();

		String input;
		while ((input = br.readLine()) != null) {
			String[] data = input.split(" ");

			// n (dollars) m (wrappers to chocolate ratio) c (chocolate price)
			int dollars = Integer.parseInt(data[0]);
			int chocolatePrice = Integer.parseInt(data[1]);
			int wrappersPerChoclate = Integer.parseInt(data[2]);

			// compute initial chocolates that can be bought which equals
			// wrappers
			int chocolates = dollars / chocolatePrice;
			int wrappers = chocolates;

			int chocolatesEaten = computePiecesRecursively(chocolates, wrappers, wrappersPerChoclate);

			System.out.println(chocolatesEaten);

		}
	}

	// while remaining wrappers are more than than 1 and can be added to future
	// wrappers by eaten chocolates, Bobby will
	// be able to buy more chocolates and get diabetes
	private static int computePiecesRecursively(int pieces, int wrappers, int ratio) {
		int earnedPieces = wrappers / ratio;
		int extraWrappers = earnedPieces + (wrappers % ratio);
		pieces += earnedPieces;
		if (extraWrappers >= ratio) {
			return computePiecesRecursively(pieces, extraWrappers, ratio);
		} else {
			return pieces;
		}
	}
}

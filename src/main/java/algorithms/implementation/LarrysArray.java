package algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		// first row is the number of test cases
		sc.nextLine();

		while ((sc.nextLine()) != null) {
			int N = sc.nextInt();
			int[] larrysArray = new int[N];
			for (int n = 0; n < N; n++)
				larrysArray[n] = sc.nextInt();

			String result = isSortableByRobot(larrysArray) ? "YES" : "NO";

			System.out.println(result);

		}
	}

	/*
	 * If the grid width is odd, then the number of inversions in a solvable
	 * situation is even If the grid width is even, and the blank is on an odd
	 * row counting from the bottom (last, third-last, fifth-last etc) then the
	 * number of inversions in a solvable situation is even.
	 */
	private static boolean isSortableByRobot(int[] a) {
		int length = a.length;
		int count = 0; // count of inversions
		for (int i = 0; i < length - 1; i++)
			for (int j = i + 1; j < length; j++)
				if (a[i] > (a[j]))
					count++;
		if (count % 2 == 0) // can be sorted
			return true;
		return false;
	}

}

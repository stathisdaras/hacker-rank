package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LarrysArray {

	private static final int ROBOT_PERMUTATION_RANGE = 3;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// first row is the number of test cases
		br.readLine();

		while ((br.readLine()) != null) {
			String[] larrysArray = br.readLine().split(" ");

			String result = isLarrysArraySortableByRobot(larrysArray) ? "YES" : "NO";

			System.out.println(result);

		}
	}

	private static boolean isLarrysArraySortableByRobot(String[] larrysArray) {

		for (int i = larrysArray.length - 1; i > ROBOT_PERMUTATION_RANGE - 2; i--) {
			for (int j = 0; j < ROBOT_PERMUTATION_RANGE; j++) {
				if (isArraySorted(larrysArray)) {
					return true;
				}
				rotateArray(larrysArray, i);
			}
		}
		return false;
	}

	private static void rotateArray(String[] a, int end) {
		int start = end - (ROBOT_PERMUTATION_RANGE - 1);
		int mid = end - (ROBOT_PERMUTATION_RANGE - 2);
		String first = a[start];
		String middle = a[mid];
		String last = a[end];
		// rotate array elements
		a[start] = middle;
		a[mid] = last;
		a[end] = first;
	}

	private static boolean isArraySorted(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i].compareTo(a[i + 1]) > 0) {
				return false; // It is proven that the array is not sorted.
			}
		}
		return true; // If this part has been reached, the array must be sorted.
	}
}

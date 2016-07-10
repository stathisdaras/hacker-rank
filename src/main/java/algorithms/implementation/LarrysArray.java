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

		int length = larrysArray.length;
		int iterations = factorial(length) / 2;
		int shift = 0;

		int factor = ROBOT_PERMUTATION_RANGE;
		int factorial = ROBOT_PERMUTATION_RANGE;

		for (int i = 1; i < iterations; i++) {

			if (isArraySorted(larrysArray)) {
				return true;
			}

			if (i % ROBOT_PERMUTATION_RANGE == 0) {
				shift++;
			}
			
			if (i / factorial == factor + 1) {
				factorial = i;
				factor++;
				shift += factor - ROBOT_PERMUTATION_RANGE;
			}


			int end = length - 1 - shift;
			int start = length - ROBOT_PERMUTATION_RANGE - shift;

			rotateArray(larrysArray, start, end);

			if (i % ROBOT_PERMUTATION_RANGE == 0) {
				shift--;
			}

			if (i / factorial == 1) {
				shift = 0;
			}

		}
		return false;
	}

	private static void rotateArray(String[] a, int start, int end) {
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

	public static int factorial(int n) {
		int fact = 1; // this will be the result
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}

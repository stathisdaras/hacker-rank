package algorithms.implementation;

import java.util.Scanner;

public class KatKaplanLarrysArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int n = 0; n < N; n++)
				A[n] = in.nextInt();
			if (robotSort(A, N))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
	
	/*
	 * Determine if a robot can sort the array by only rotating a set of indices
	 */
	static boolean robotSort(int[] A, int N) {
		int count = 0; // out of position count
		for (int i = 0; i < N - 1; i++)
			for (int j = i + 1; j < N; j++)
				if (A[i] > A[j])
					count++;
		if (count % 2 == 0) // can be sorted
			return true;
		return false;
	}
}
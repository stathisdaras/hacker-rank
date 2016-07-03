package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceLane {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// first row is N T
		br.readLine();

		// second row is the width array
		String[] widthArray = br.readLine().split(" ");

		String input;
		while ((input = br.readLine()) != null) {
			String[] points = input.split(" ");

			int entry = Integer.parseInt(points[0]);
			int exit = Integer.parseInt(points[1]);

			String min = "3";

			// find min width between entry and exit points in the sevice lane
			for (int i = entry; i <= exit; i++) {
				if (widthArray[i].compareTo(min) < 0) {
					min = widthArray[i];
				}
			}

			System.out.println(min);

		}
	}
}

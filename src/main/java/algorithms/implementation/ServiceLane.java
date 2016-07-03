package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

			// create subarray and convert it to list
			List<String> laneDrive = Arrays.asList(Arrays.copyOfRange(widthArray, entry, exit));
			
			// find min width between entry and exit points in the sevice lane
			System.out.println(Collections.min(laneDrive));

		}
	}
}

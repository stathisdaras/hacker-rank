package javistas.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class BitSetDS {

	static BitSet B1;
	static BitSet B2;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] headers = br.readLine().split(" ");
		int N = Integer.parseInt(headers[0]);
		// int T = Integer.parseInt(headers[1]);
		// Initialize BitSets
		B1 = new BitSet();
		B2 = new BitSet();

		String input;
		while ((input = br.readLine()) != null) {

			String[] data = input.split(" ");

			String operation = data[0];
			int operand1 = Integer.parseInt(data[1]);
			int operand2 = Integer.parseInt(data[2]);

			operate(operation, operand1, operand2, N);
			
			System.out.println(B1.cardinality() + " " + B2.cardinality());

		}
	}

	private static void operate(String operation, int o1, int o2, int n) {
		switch (operation) {
		case "AND":
			if (o1 == 1) {
				B1.and(B2);
			} 
			else {
				B2.and(B1);
			}
			break;
		case "OR":
			if (o1 == 1) {
				B1.or(B2);
			} 
			else {
				B2.or(B1);
			}
			break;
		case "XOR":
			if (o1 == 1) {
				B1.xor(B2);
			} 
			else {
				B2.xor(B1);
			}
			break;
		case "FLIP":
			if (o1 == 1) {
				B1.flip(o2);
			} 
			else {
				B2.flip(o2);
			}
			break;
		case "SET":
			if (o1 == 1) {
				B1.set(o2);
			} 
			else {
				B2.set(o2);
			}
		}

	}
}

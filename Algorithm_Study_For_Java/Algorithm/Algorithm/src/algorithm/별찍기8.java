package algorithm;

import java.util.Scanner;

public class º°Âï±â8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				// *
			}

			for (int j = i; j < 2 * N - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
				// *
			}

			System.out.println("");
		}

		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				// *
			}

			for (int j = i; j < 2 * N - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
				// *
			}
			System.out.println("");
		}
	}
}

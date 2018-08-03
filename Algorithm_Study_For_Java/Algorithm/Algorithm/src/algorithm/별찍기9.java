package algorithm;

import java.util.Scanner;

public class 별찍기9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// 입력

		for (int i = N; i > 0; i--) {

			// 공백
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}
			// 별표
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}

			// 공백
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

		for (int i = 0; i < N - 1; i++) {
			// 공백
			for (int j = i + 1; j < N - 1; j++) {
				System.out.print(" ");
			}
			// 별표
			for (int j = 0; j < 2 * (i + 1) + 1; j++) {
				System.out.print("*");
			}

			// 공백
			for (int j = i + 1; j < N - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}

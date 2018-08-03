package algorithm;

import java.util.Scanner;

public class º°Âï±â5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// º°ÀÇ °¹¼ö Á¤ÀÇ
		int k = 0;
		int j = 0;
		for (int i = 1; i <= N; i++) {
			for (j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			// * ´Ù Àû¾úÀ» ‹š Ä­ ¶ç¿ì±â
			System.out.println("");
		}

		for (int i = N - 1; i > 0; i--) {
			for (j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			// * ´Ù Àû¾úÀ» ‹š Ä­ ¶ç¿ì±â
			System.out.println("");
		}
	}
}

package algorithm;

import java.util.Scanner;

public class 날짜계산_1476 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * E , M , S --> 날짜 1<= E && E <= 15 1<= S && S <= 28 1<= M && M <= 19
		 */
		scan = new Scanner(System.in);
		int m = 1, s = 1, e = 1;
		int M = scan.nextInt();
		int S = scan.nextInt();
		int E = scan.nextInt();
		for (int i = 1; i < 16 * 28 * 19; i++) {
			if (e == E && s == S && m == M) {
				System.out.println(i);
				break;
			}
			m += 1;
			s += 1;
			e += 1;

			if (e == 16)
				e = 1;
			if (s == 29)
				s = 1;
			if (m == 20)
				m = 1;
		}
	}
}

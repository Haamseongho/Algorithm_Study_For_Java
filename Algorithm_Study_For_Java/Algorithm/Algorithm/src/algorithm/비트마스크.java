package algorithm;

import java.util.Scanner;

public class 비트마스크 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int bitSet = 0;
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < t; i++) {
			String command = scanner.next();

			if ("add".equals(command)) {
				int n = scanner.nextInt();
				bitSet = bitSet | (1 << n);
			} else if ("remove".equals(command)) {
				int n = scanner.nextInt();
				bitSet = bitSet & ~(1 << n);
			} else if ("check".equals(command)) {
				int n = scanner.nextInt();
				int result = (bitSet & (1 << n));
				if (result > 0) {
					answer.append("1\n");
					System.out.println(1);
				} else if (result == 0) {
					answer.append("0\n");
					System.out.println(0);
				}
			} else if ("toggle".equals(command)) {
				int n = scanner.nextInt();
				bitSet = bitSet ^ (1 << n);
			} else if ("all".equals(command)) {
				bitSet = (1 << 21) - 1;
				bitSet = bitSet & ~(1);
			} else if ("empty".equals(command)) {
				bitSet = 0;
			}
		}
		System.out.println(answer);
	}
}

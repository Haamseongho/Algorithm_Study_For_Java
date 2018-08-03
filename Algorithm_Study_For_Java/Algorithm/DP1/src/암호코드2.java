import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호코드2 {

	private static Scanner scanner;
	private static String input;
	private static long[] d;
	private static final long mod = 1000000;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		input = scanner.nextLine().trim();

		d = new long[input.length() + 1];

		input = "" + input;
		d[0] = 1;
		for (int i = 1; i <= d.length; i++) {
			// 한 자리
			int x = input.charAt(i) - '0';
			if ((x < 10) && (x  >= 1)) {
				d[i] = (d[i] + d[i - 1]) % mod;
			}

			if (i == 1)
				continue;

			if (input.charAt(i - 1) == '0')
				continue;

			x = (input.charAt(i - 1) - '0') * 10 + (input.charAt(i));

			if ((x >= 10) && (x <= 26)) {
				d[i] = (d[i] + d[i - 2]) % mod;
			}
		}

		System.out.println(d[input.length()]);
	}
}

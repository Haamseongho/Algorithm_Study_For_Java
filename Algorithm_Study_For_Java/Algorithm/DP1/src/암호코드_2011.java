import java.util.Scanner;

// DP로 푸는 경우
public class 암호코드_2011 {

	private static Scanner scanner;
	private static long[] d;
	private static int[] a;
	private static final long mod = 1000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		String input = scanner.nextLine().trim();
		int input_length = input.length();
		d = new long[input_length + 1];
		d[0] = 1;
		
		input = " " + input;

		for (int i = 1; i <= input_length; i++) {
			int x = input.charAt(i) - '0'; //
			if (1 <= x && x <= 9) {
				d[i] = (d[i] + d[i - 1]) % mod;
			}
			if (i == 1) {
				continue;
			}
			
			if(input.charAt(i-1) == '0') {
				continue;
			}

			x = (input.charAt(i - 1) - '0') * 10 + (input.charAt(i) - '0');

			if (10 <= x && x <= 26) {
				d[i] = (d[i] + d[i - 2]) % mod;
			}
		}

		System.out.println(d[input_length]);
	}
}

import java.util.Scanner;

public class 이곱하기N타일링 {
	private static Scanner scanner;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n + 1];

		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		// d[3] = 3;

		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1] + d[i - 2];
			d[i] %= 10007;
		}

		System.out.println(d[n]);
	}

}

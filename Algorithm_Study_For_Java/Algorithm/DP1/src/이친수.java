import java.util.Scanner;

public class 이친수 {
	private static Scanner scanner;
	private static long[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new long[n + 1];
		// 자릿수 , 0 or 1
		d[1] = 1;
		if (n >= 2) {
			d[2] = 1; // 자릿수가 2 이상일 경우 즉, 두 자리 이상의 숫자가 나온다는 것인데,
			// 두 자리만을 갖는 이친수는 하나 입니다.
		}

		for (int i = 3; i <= n; i++)
			d[i] = d[i - 1] + d[i - 2];

		System.out.println(d[n]);
	}
}

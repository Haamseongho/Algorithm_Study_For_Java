import java.util.Scanner;

public class 포도주시식_1차원_DP {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		a = new int[n + 1];
		d = new int[n + 1];
		/*
		 * 0번 연속 --> d[i] = d[i-1] 1번 연속 --> d[i] = a[i] + d[i-1]; 2번 연속 --> d[i] = a[i]
		 * + a[i-1] + d[i-2];
		 */

		// n은 10000 이하 , 포도주의 양은 1000이하 이기 때문에 충분히 int로 해도 된다.
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt(); // 포도주의 양
		}

		d[1] = a[1];
		d[2] = a[1] + a[2];

		long ans = 0;
		for (int i = 3; i <= n; i++) {
			// 바로 체크
			// 0번 연속
			d[i] = d[i - 1];
			if (d[i] < d[i - 2] + a[i]) {
				// 1번 연속 --> i번째 포도주 마시고 i-1번째 마시지 말고 i-2번째는 마셔도 되고 안마셔도 되고
				d[i] = d[i - 2] + a[i];
			}

			// 2번 연속
			if (d[i] < d[i - 3] + a[i] + a[i - 1]) {
				// i 번째 포도주 마시고 i-1 번쨰 포도주 마시고 i-2 번째 포도주는 마시면 절대 안되고 i-3번째 포도주는 마셔도 되고 안마셔도 되고.
				d[i] = d[i - 3] + a[i] + a[i - 1];
			}

		}
		ans = d[n];
		System.out.println(ans);
	}

}

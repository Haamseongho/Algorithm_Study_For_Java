import java.util.Scanner;


public class 계단오르기 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n + 1][3];
		a = new int[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();
		// 점수 체크
		// d[0] = a[0];
		
		d[1][1] = a[1]; // 처음 시작점 --> 1회 연속 시작 --> 밟은것 a[1];

		for (int i = 2; i <= n; i++) {
			d[i][2] = d[i - 1][1] + a[i];
			d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + a[i];
		}

		// 마지막 계단을 밟았을 떄 최대 값을 체크해야함
		// 마지막 계단을 밟았을 때 이게 2번 연속으로해서 밟은 것인지, 1회 연속으로 밟은 것인지 체크해야한다.

		int ans = Math.max(d[n][1], d[n][2]);
		System.out.println(ans);
	}

}

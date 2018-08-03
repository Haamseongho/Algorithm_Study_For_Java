import java.util.Scanner;

public class 팰린드롬_1 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 입력 갯수
		a = new int[N + 1];
		d = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = scanner.nextInt();
		}

		int t = scanner.nextInt(); // test case
		while (t-- > 0) {
			int s = scanner.nextInt();
			int e = scanner.nextInt();

			System.out.println(go(s, e));
		}
	}

	private static int go(int i, int j) {
		if (i == j) {
			// 시작점과 끝점이 같을 경우 ==> 길이가 1일 경우
			return 1;
		} else if (i + 1 == j) {
			// 시작점과 끝점이 하나 차이 나는 경우 (길이가 2)
			if (a[i] == a[j]) {
				return 1;
			} else {
				return 0;
			}
		} else {
			// 길이 3이상
			// memorization 조건
			if (d[i][j] > 0) {
				return d[i][j];
			}
			if (a[i] != a[j]) {
				// 팰린드롬이 아닌 경우
				return d[i][j] = 0; // 0으로 출력
			} else {
				// 팰린드롬인 경우
				return d[i][j] = go(i + 1, j - 1);
				// 다음이 팰린드롬인지 체크하기
				// --> 어차피 팰린드롬일 경우 return 1이 되므로
			}
		}
	}
}

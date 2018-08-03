import java.util.Scanner;

public class 내리막길 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[][] a;
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int n, m;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();

		a = new int[n][m];
		d = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt();
				d[i][j] = -1;
			}
		}

		// -1 로 초기화 해야 0보다 크거나 같을 경우 memorization 가능
		System.out.println(go(a, d, 0, 0)); // 재귀 함수는 0,0 부터 시작하는 것! 잊지마세요~
	}

	private static int go(int[][] a, int[][] d, int x, int y) {
		// 종료 조건 --> 시작점과 종료점이 같을 경우
		if (x == n-1 && y == m-1) {
			return 1;
		}

		if (d[x][y] >= 0)
			return d[x][y];

		d[x][y] = 0; // 0으로 초기화해야만 재귀로 함수를 호출 한 뒤 값을 더할 때 중복해서 더해지지가 않는다.

		for (int i = 0; i < 4; i++) {
			// 동서남북으로 갈 수 있는 경우가 있기 때문에 총 배열 요소가 4개이므로 4번의 반복문을 돌린다.
			int nx = x + dx[i];
			int ny = y + dy[i];
			if ((nx >= 0 && nx < n) && (ny >= 0 && ny < m)) {
				// 범위 내에서 돌아갈 때
				if (a[x][y] > a[nx][ny]) // 이동할 곳의 값이 이동하기 전의 값보다 작아야함 .
					d[x][y] += go(a, d, nx, ny); // 가장 중요하다. 이동한 좌표로 재귀를 돌려야한다. 해당 값은 x,y에 계속해서 더해준다. 그리고 반환한다.
			}
		}
		return d[x][y];
	}
}

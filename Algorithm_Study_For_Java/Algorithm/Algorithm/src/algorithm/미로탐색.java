package algorithm;

public class 미로탐색 {

	static int[] moveRow = { 1, -1, 0, 0 };
	static int[] moveCol = { 0, 0, 1, -1 };
	static boolean[][] flag;
	static int maze[][] = { { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0 }, { 1, 1, 1, 0, 1, 1 } };
	static int M, N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int width = maze[0].length;
		int height = maze.length;
		flag = new boolean[height][width];
		
		
		for(int i=0;i<4;i++) {
			System.out.println(dfs(1,1));
		}
	}

	// dfs
	static int dfs(int y, int x) {

		M = maze[0].length;
		N = maze.length;
		if (maze[0][0] == 0) {
			return 0;
		}

		// 이미 지나온 곳이면 1 반환
		if (flag[y][x]) {
			return 1;
		}

		flag[y][x] = true;
		int value = 1;

		if (x + 1 < M && maze[y][x + 1] == 1) {
			value += dfs(y, x + 1);
		}

		if (x - 1 > 0 && maze[y][x - 1] == 1) {
			value += dfs(y, x - 1);
		}

		if (y + 1 < N && maze[y + 1][x] == 1) {
			value += dfs(y + 1, x);
		}

		if (y - 1 > 0 && maze[y - 1][x] == 1) {
			value += dfs(y - 1, x);
		}
		
		return value;
	}
}

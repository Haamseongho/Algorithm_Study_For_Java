package algorithm;

public class 틱택톡_게임 {

	static boolean[][] grid = new boolean[100][100];
	static int[] vx = { -1, 1, 0, 0 };
	static int[] vy = { 0, 0, -1, 1 };
	static int[] vxy = { -1, 1, 0, 0 };
	static int[] vyx = { 0, 0, -1, 1 };
	static double[] prob = new double[8];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A는 'O' , B는 'X'
		System.out.print(getProbability(25,25,25,25,25,25,25,25,2));
	}

	static double getProbability(int east, int west, int south, int north, int west_north, int east_north,
			int west_south, int east_south, int n) {
		prob[0] = east / 100.0;
		prob[1] = west / 100.0;
		prob[2] = south / 100.0;
		prob[3] = north / 100.0;
		prob[4] = west_north / 100.0;
		prob[5] = east_north / 100.0;
		prob[6] = west_south / 100.0;
		prob[7] = east_south / 100.0;

		return dfs(1, 1, 1, 1, 2);
	}

	static double dfs(int x, int y, int z1, int z2, int n) {
		if (grid[x][y])
			return 0;

		if (n == 0)
			return 1;

		// 초기값. >> 이미 지나온 곳은 갈 수 없음
		// n == 0
		double ret = 0.0;
		grid[x][y] = true;
		for (int i = 0; i < 4; i++) {
			ret += dfs(x + vx[i], y + vy[i], z1 + vxy[i], z2 + vyx[i], n - 1) * prob[i];
		}
		
		return ret;
	}
}

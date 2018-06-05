package algorithm;

public class 깊이우선탐색 {

	// 행과 열을 지나갔는지 확인하기 위해 boolean 값으로 설정함.

	static boolean[][] grid = new boolean[100][100];
	static int vx[] = { 1, -1, 0, 0 };
	static int vy[] = { 0, 0, 1, -1 };
	static double[] prob = new double[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 조건 : 전체 판 그려두고 2차원 배열로해서 접근한다. 접근한 경우면 true , 아닌 경우면 false를준다. 0. 이동 방향을
		 * 설정해준다. 이거 배열로 두면 개꿀임 (예: 동서 [1,-1,0,0] , 남북 : [0,0,1,-1] 1. 이동 가능한 횟수와 동서남북
		 * 어디로 이동할 것인지 체크 2. 동서남북으로 이동할 때 확률을 우선 각각 25%씩 두는건데 각각 다를 수 있기 때문에 변수로 두기 3.
		 * 구하려는 것이 무엇인가?
		 * 
		 * 이동하는 방향을 동서남북으로 나누어 서로 반대되는 것은 부호로 반대처리한다.
		 * 그리고 동서남북으로 이동할 수 있는 확률을 각각 1/4로 두고 계산한다. 
		 * n은 탐색 횟수입니다.
		 * 동서남북 각각의 확률을 배열에 넣고 이제 dfs함수를 부릅니다.
		 * dfs 깊이우선순회에서 중요한 것은 초기 조건입니다.
		 * 초기에 잘못된 조건을 먼저 구한다.
		 * 1. 이미 지난 곳일 경우 >> grid[x][y] = true일때,
		 * 2. 탐색 횟수가 0일때 
		 */
		
		System.out.print(getProbability(20, 25, 25, 25, 25));
	}

	public static double getProbability(int n, int east, int west, int south, int north) {

		prob[0] = east / 100.0;
		prob[1] = west / 100.0;
		prob[2] = south / 100.0;
		prob[3] = north / 100.0;
		// 각자 동서남북 지날 때의 확률
		// 50,50 은 초기 위치
		return dfs(50, 50, n);
	}

	// dfs가 본격적으로 이동하는 함수임 (재귀함수) >> 너비우선순회일 경우 Queue를 활용하지만 깊이우선순회일 경우 모두 다 거쳐야하므로
	// 배열로 한다.
	public static double dfs(int x, int y, int n) {

		// 매우 중요함!! 초기 조건을 잡아주는 것이 핵심
		// true일 경우 이미 지난 곳이라 판단 >> return 0을 반환
		if (grid[x][y]) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		// 이동 시작!! 얼마만큼 돌릴까??
		/*
		 *	 
		 */
		double ret = 0;
		grid[x][y] = true;
		for (int i = 0; i < 4; i++) {
			ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i];
		}
		return ret;
	}
}

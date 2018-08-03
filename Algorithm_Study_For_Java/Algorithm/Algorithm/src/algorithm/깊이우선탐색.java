package algorithm;

public class ���̿켱Ž�� {

	// ��� ���� ���������� Ȯ���ϱ� ���� boolean ������ ������.

	static boolean[][] grid = new boolean[100][100];
	static int vx[] = { 1, -1, 0, 0 };
	static int vy[] = { 0, 0, 1, -1 };
	static double[] prob = new double[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * ���� : ��ü �� �׷��ΰ� 2���� �迭���ؼ� �����Ѵ�. ������ ���� true , �ƴ� ���� false���ش�. 0. �̵� ������
		 * �������ش�. �̰� �迭�� �θ� ������ (��: ���� [1,-1,0,0] , ���� : [0,0,1,-1] 1. �̵� ������ Ƚ���� ��������
		 * ���� �̵��� ������ üũ 2. ������������ �̵��� �� Ȯ���� �켱 ���� 25%�� �δ°ǵ� ���� �ٸ� �� �ֱ� ������ ������ �α� 3.
		 * ���Ϸ��� ���� �����ΰ�?
		 * 
		 * �̵��ϴ� ������ ������������ ������ ���� �ݴ�Ǵ� ���� ��ȣ�� �ݴ�ó���Ѵ�.
		 * �׸��� ������������ �̵��� �� �ִ� Ȯ���� ���� 1/4�� �ΰ� ����Ѵ�. 
		 * n�� Ž�� Ƚ���Դϴ�.
		 * �������� ������ Ȯ���� �迭�� �ְ� ���� dfs�Լ��� �θ��ϴ�.
		 * dfs ���̿켱��ȸ���� �߿��� ���� �ʱ� �����Դϴ�.
		 * �ʱ⿡ �߸��� ������ ���� ���Ѵ�.
		 * 1. �̹� ���� ���� ��� >> grid[x][y] = true�϶�,
		 * 2. Ž�� Ƚ���� 0�϶� 
		 */
		
		System.out.print(getProbability(20, 25, 25, 25, 25));
	}

	public static double getProbability(int n, int east, int west, int south, int north) {

		prob[0] = east / 100.0;
		prob[1] = west / 100.0;
		prob[2] = south / 100.0;
		prob[3] = north / 100.0;
		// ���� �������� ���� ���� Ȯ��
		// 50,50 �� �ʱ� ��ġ
		return dfs(50, 50, n);
	}

	// dfs�� ���������� �̵��ϴ� �Լ��� (����Լ�) >> �ʺ�켱��ȸ�� ��� Queue�� Ȱ�������� ���̿켱��ȸ�� ��� ��� �� ���ľ��ϹǷ�
	// �迭�� �Ѵ�.
	public static double dfs(int x, int y, int n) {

		// �ſ� �߿���!! �ʱ� ������ ����ִ� ���� �ٽ�
		// true�� ��� �̹� ���� ���̶� �Ǵ� >> return 0�� ��ȯ
		if (grid[x][y]) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		// �̵� ����!! �󸶸�ŭ ������??
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

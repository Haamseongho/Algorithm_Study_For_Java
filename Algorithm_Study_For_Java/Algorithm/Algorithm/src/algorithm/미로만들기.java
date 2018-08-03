package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class �̷θ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] maze = { "...", "...", "..." };
		int[] moveRow = { 1, 0, -1, 0 };
		int[] moveCol = { 0, 1, 0, -1 };
		System.out.println(longestPath(maze, 0, 1, moveRow, moveCol));
	}

	// �ִ��� �ʰ� ���� ������ ����� ���� ��.
	public static int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {

		// �ʱ� ����
		// �̵��ϴ� X�� Y�� ���� ������ �������� �� ��.
		int width = maze[0].length();
		int height = maze.length;
		// ����
		/*
		 * '.' ��ġ�� ���� �ʾƾ��� ('.'�� �ⱸ�̱� ������) --> �ִ��� ��~��
		 * 
		 */
		// X,Y �̵��ϴ� �� ť�� ���� ��.
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();

		int[][] moveArr = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				moveArr[i][j] = -1;
			}
		}
		queueX.add(startRow);
		queueY.add(startCol);

		while (!queueX.isEmpty()) {
			int x = queueX.poll();
			int y = queueY.poll();
			// ť�� �ִ� x,y ��������
			for (int i = 0; i < moveRow.length; i++) {
				// ������ �̵��ϴ� ��ŭ ���� ���� �̵�
				int nextX = x + moveRow[i];
				int nextY = y + moveCol[i];

				// ���� �׻� �ִ� ��η� Ż���Ѵ�.
				// �ִ� �̵� Ƚ���� ���ؾ� ��
				if ((0 <= nextX && nextX < width) && (0 <= nextY && nextY < height)
						&& (maze[nextY].charAt(nextX) == '.') && moveArr[nextY][nextX] == -1) {

					moveArr[nextX][nextY] = moveArr[x][y] + 1;
					queueX.add(nextX);
					queueY.add(nextY);
				}
			}
		}

		int max = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((maze[i].charAt(j) == '.') && (moveArr[i][j] == -1)) {
					return -1;
				}

				max = Math.max(max, moveArr[i][j]);

			}
		}
		return max;
	}

}

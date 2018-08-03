package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class 미로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] maze = { "...", "...", "..." };
		int[] moveRow = { 1, 0, -1, 0 };
		int[] moveCol = { 0, 1, 0, -1 };
		System.out.println(longestPath(maze, 0, 1, moveRow, moveCol));
	}

	// 최대한 늦게 짐이 나오게 만들고 싶은 것.
	public static int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {

		// 초기 조건
		// 이동하는 X나 Y는 범위 내에서 움직여야 할 것.
		int width = maze[0].length();
		int height = maze.length;
		// 조건
		/*
		 * '.' 위치에 닿지 않아야함 ('.'은 출구이기 때문에) --> 최대한 길~게
		 * 
		 */
		// X,Y 이동하는 거 큐에 넣을 것.
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
			// 큐에 있는 x,y 빼오내기
			for (int i = 0; i < moveRow.length; i++) {
				// 행으로 이동하는 만큼 열도 같이 이동
				int nextX = x + moveRow[i];
				int nextY = y + moveCol[i];

				// 짐은 항상 최단 경로로 탈출한다.
				// 최대 이동 횟수를 구해야 함
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

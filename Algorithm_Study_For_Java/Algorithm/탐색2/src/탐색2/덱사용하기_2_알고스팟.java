package 탐색2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Nodes {
	int x;
	int y;

	public Nodes(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class 덱사용하기_2_알고스팟 {

	private static Scanner scanner;
	private static Deque<Nodes> maze_deque;
	private static boolean[][] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maze_deque = new ArrayDeque<Nodes>();
		scanner = new Scanner(System.in);

		int row = scanner.nextInt();
		int col = scanner.nextInt();

		scanner.nextLine();
		int[][] dist = new int[col][row]; // 이동
		int[][] maze = new int[col][row]; // 미로
		check = new boolean[col][row]; // 자동으로 false 들어감

		for (int i = 0; i < col; i++) {
			String str = scanner.nextLine();
			for (int j = 0; j < row; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}

		dist[0][0] = 0;
		maze_deque.add(new Nodes(0, 0)); // (0,0) 노드 저장
		// 이동 --> row / col
		int dx[] = { 0, 0, 1, -1 };
		int dy[] = { 1, -1, 0, 0 };

		while (!maze_deque.isEmpty()) {
			Nodes node = maze_deque.remove();
			int x = node.x;
			int y = node.y;

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if ((nx >= 0 && nx < col) && (ny >= 0 && ny < row)) {
					// maze 범위 내어야 합니다.
					// nx,ny가 방문하지 않아야 합니다.
					if (!check[nx][ny]) {
						// 처음에 false이기 떄문에 true로 들어감 --> 방문하지 않은 것으로 접근
						if (maze[nx][ny] == 0) {
							// 벽이 없는 것
							dist[nx][ny] = dist[x][y];
							// deque 이기 때문에 가능 --> 벽이 없는 경우는 앞에다가 저장
							maze_deque.addFirst(new Nodes(nx, ny));
							check[nx][ny] = true; // 방문했다고 체크
						}
						// 벽이 있는 노드로 이동하는 경우
						else {
							// 벽을 꺠고 부수고 들어갈 때 1 증가
							dist[nx][ny] = dist[x][y] + 1;
							// deque라 가능함 --> 마지막에 추가
							maze_deque.addLast(new Nodes(nx, ny));
							check[nx][ny] = true; // 방문했다고 체크
						}
					}
				}
			}
		}
		System.out.println(dist[col - 1][row - 1]);
	}

}

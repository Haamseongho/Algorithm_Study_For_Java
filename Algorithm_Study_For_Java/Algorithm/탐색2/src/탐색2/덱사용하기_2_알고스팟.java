package Ž��2;

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

public class ������ϱ�_2_�˰��� {

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
		int[][] dist = new int[col][row]; // �̵�
		int[][] maze = new int[col][row]; // �̷�
		check = new boolean[col][row]; // �ڵ����� false ��

		for (int i = 0; i < col; i++) {
			String str = scanner.nextLine();
			for (int j = 0; j < row; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}

		dist[0][0] = 0;
		maze_deque.add(new Nodes(0, 0)); // (0,0) ��� ����
		// �̵� --> row / col
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
					// maze ���� ����� �մϴ�.
					// nx,ny�� �湮���� �ʾƾ� �մϴ�.
					if (!check[nx][ny]) {
						// ó���� false�̱� ������ true�� �� --> �湮���� ���� ������ ����
						if (maze[nx][ny] == 0) {
							// ���� ���� ��
							dist[nx][ny] = dist[x][y];
							// deque �̱� ������ ���� --> ���� ���� ���� �տ��ٰ� ����
							maze_deque.addFirst(new Nodes(nx, ny));
							check[nx][ny] = true; // �湮�ߴٰ� üũ
						}
						// ���� �ִ� ���� �̵��ϴ� ���
						else {
							// ���� �ư� �μ��� �� �� 1 ����
							dist[nx][ny] = dist[x][y] + 1;
							// deque�� ������ --> �������� �߰�
							maze_deque.addLast(new Nodes(nx, ny));
							check[nx][ny] = true; // �湮�ߴٰ� üũ
						}
					}
				}
			}
		}
		System.out.println(dist[col - 1][row - 1]);
	}

}

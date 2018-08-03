package 탐색2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



class Node {
	int x;
	int y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}


public class 덱사용하기 {

	private static Scanner scanner;
	private static int[] dx = { 0, 0, -1, 1 };
	private static int[] dy = { -1, 1, 0, 0 };
	private static int[][] maze;
	private static int row;
	private static int col;
	private static int[][] dist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		row = scanner.nextInt();
		col = scanner.nextInt();
		scanner.nextLine();
		
		maze = new int[col][row];
		dist = new int[col][row];
		for (int i = 0; i < col; i++) {
			String s = scanner.nextLine();
			for (int j = 0; j < row; j++) {
				maze[i][j] = s.charAt(j) - '0';
			}
		}
		Queue<Node> next_node = new LinkedList<Node>(); // 노드 넣을 거;
		Queue<Node> move_queue = new LinkedList<Node>(); // maze값 넣을 거;
		move_queue.offer(new Node(0, 0)); // 0,0에서 시작
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				dist[i][j] = -1;
			}
		}
		dist[0][0] = 0;
		while (!move_queue.isEmpty()) {
			Node node = move_queue.remove();
			int x = node.x; // x좌표
			int y = node.y; // y좌표

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if ((nx >= 0 && nx < col) && (ny >= 0 && ny < row)) {
					if (dist[nx][ny] == -1) {
						if (maze[nx][ny] == 0) {
							dist[nx][ny] = dist[x][y];
							move_queue.offer(new Node(nx, ny));
						} else {
							dist[nx][ny] = dist[x][y] + 1;
							next_node.offer(new Node(nx, ny));
						}
					}
				}
			}
			
			if(move_queue.isEmpty()) {
				move_queue = next_node;
				next_node = new LinkedList<>();
			}
		}
		
		System.out.println(dist[row-1][col-1]);
	}
}


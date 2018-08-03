package 큐;

import java.util.Scanner;

public class 알파벳 {

	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };
	private static Scanner scanner;

	private static int alphabet(String[] board, boolean[] check, int x, int y) {
		int ans = 0;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

	
			if ((nx >= 0 && nx < board.length) && (ny >= 0 && ny < board[0].length())) {
				if (check[board[nx].charAt(ny) - 'A'] == false) {
					check[board[nx].charAt(ny) - 'A'] = true;

					int next = alphabet(board, check, nx, ny);
					if (ans < next)
						ans = next;

					check[board[nx].charAt(ny) - 'A'] = false;
				}
			}
		}

		return ans + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int xNum = scanner.nextInt();
		int yNum = scanner.nextInt();
		scanner.nextLine();
		String[] board = new String[xNum];
		for (int i = 0; i < xNum; i++) {
			board[i] = scanner.nextLine();
		}
		boolean check[] = new boolean[26]; // 알파벳 26개
		check[board[0].charAt(0) - 'A'] = true; // 처음 시작 부분은 출발지점이기 때문에 이미 방문했다고 가정
		int answer = alphabet(board, check, 0, 0);
		System.out.println(answer);
	}
}

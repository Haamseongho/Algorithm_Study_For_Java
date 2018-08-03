package 큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N_Queen {

	static Scanner scanner;
	static Queue queue;
	static boolean a[][];
	static int row_num;
	static boolean check_dv1[];
	static boolean check_dv2[];
	static boolean check_col[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		queue = new LinkedList<Integer>();

		row_num = scanner.nextInt();
		a = new boolean[15][15]; // 행의 수가 10이면 10 * 10 행렬 만들어두기
		// 행의 갯수
		check_dv1 = new boolean[40];
		check_dv2 = new boolean[40];
		check_col = new boolean[row_num];

		int ans = queen_located(0);
		System.out.println(ans);
	}

	private static boolean check(int row, int col) {
		if (check_col[col]) {
			return false; // 처음값은 다 false로 초기화 된 상황
			// 해당 열에 이미 퀸이 있다면 다음 열부터는 퀸이 올 수 없음
		}

		if (check_dv1[row + col]) {
			return false;
		}

		if (check_dv2[row - col + row_num]) {
			return false;
		}

		return true;
	}

	private static int queen_located(int row) {
		if (row == row_num)
			return 1;

		int count = 0;
		for (int col = 0; col < row_num; col++) {
			if (check(row, col)) {
				check_col[col] = true;
				check_dv1[row + col] = true;
				check_dv2[row - col + row_num] = true;
				a[row][col] = true; // 퀸이 있움

				count += queen_located(row + 1); // 다음 행으로 이동

				// Back Tracking ... 다시 처음으로 돌린 다음에 행열 정리

				//System.out.println("루프 체크" + " " + count);
				check_col[col] = false;
				check_dv1[row + col] = false;
				check_dv2[row - col + row_num] = false;
				a[row][col] = false;

			}
		}

		return count;
	}
}

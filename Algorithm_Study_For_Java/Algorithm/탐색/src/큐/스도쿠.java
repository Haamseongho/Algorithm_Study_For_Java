package ť;

import java.util.Scanner;

public class ������ {

	private static Scanner scanner;
	private static int[][] input;
	// private static ArrayList<Object> list;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		input = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				input[i][j] = scanner.nextInt();
			}
		}
		sudoku();
	}
	
	
	private static void sudoku() {

		int x = -1;
		int y = -1;
		// �̹� 0�� ���Ǿ��� ����

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (input[i][j] == 0) {
					// 0�� �� �� �κп� 1~9������ �� ����
					x = i;
					y = j;
					// �� ��� ���� ������ ����.
					// ���⼭ üũ �Լ��� �Ѿ��. (���� 2�� �����ϴ���)
					break;
				}
			}
			if (x != -1)
				break;
		}

		if (x == -1) {
			print_sudoku();
		}
		for (int k = 1; k <= 9; k++) {
			if (check(x, y, k)) {
				input[x][y] = k;
				sudoku();
				input[x][y] = 0; // ��Ʈ��ŷ
			}
		}
	}
	
	private static boolean check(int x, int y, int k) {
		try {
			for (int i = 0; i < 9; i++) {
				//System.out.print(input[x][y]);
				if (input[x][i] == k || input[i][y] == k) {
					return false;
				}
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		int squareX = (x / 3) * 3;
		int squareY = (y / 3) * 3;

		for (int n1 = squareX; n1 < squareX + 3; n1++) {
			for (int n2 = squareY; n2 < squareY + 3; n2++) {
				if (input[n1][n2] == k)
					return false;
			}
		}

		return true;
	}


	private static void print_sudoku() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

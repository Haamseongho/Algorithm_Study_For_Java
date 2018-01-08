import java.util.Scanner;
import java.util.Stack;

public class ������_���ġ_13413 {

	private static String othello1; // Before
	private static String othello2; // After
	private static Scanner scan;
	private static int strLength;
	private static int w_count; // 'W' - 'B' cnt
	private static int b_count; // 'B' - 'W' cnt
	private static int[] result;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		result = new int[testCase];
		// testCase

		// ���ڿ� ����

		for (int i = 0; i < testCase; i++) {
			strLength = scan.nextInt();
			othello1 = scan.next(); // before ���ڿ� �־��ֱ�
			othello2 = scan.next(); // after ���ڿ� �־��ֱ�

			checkOthelloNum(othello1, othello2, strLength, i);
		}

		for (int j = 0; j < testCase; j++) {
			System.out.println(result[j]);
		}
	}

	private static void checkOthelloNum(String before, String after, int length, int i2) {
		for (int i = 0; i < length; i++) {
			// W - B ��Ʈ
			if (before.charAt(i) == 'W' && after.charAt(i) == 'B') {
				w_count += 1;
			}
			// B - W ��Ʈ
			else if (before.charAt(i) == 'B' && after.charAt(i) == 'W') {
				b_count += 1;
			}
		}
		result[i2] = Math.abs(w_count - b_count) + ((w_count - b_count < 0) ? w_count : b_count);
		w_count = 0; // �ʱ�ȭ
		b_count = 0; // �ʱ�ȭ

		// ���� w_count�� 3 b_count�� 2�� b_count�� + w_count - b_count ���� �ȴ�.

	}
}
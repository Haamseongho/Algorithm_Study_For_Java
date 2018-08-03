package algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryGap {

	static ArrayList<Integer> dataList;

	public static void main(String[] args) {
		// BinaryGap
		/*
		 * N ���� �����µ� ���� 0�� �� �� ������ ������ �׸� �д�. �������� ����ؼ� ���ڿ��� �����ݴϴ�. charAt�Լ��� �̿��Ͽ� 1�� ����
		 * ������ 0�� ������ ī�����ϰ� ���� 1�� ���Դµ� �� 1�� ������ boolean���� �ٲ㼭 �ٽ� 1�� ã���� �Ѵ�.
		 */
		System.out.print(solution(1041));
	}
	// 0�� ���� �� �� �̾��ִ°ų�

	static int solution(int N) {
		int cnt = 0;
		int max = 0;
		Stack<Integer> stack = new Stack<Integer>();

		do {
			stack.push(N % 2);
			N = (int) (N / 2);
		} while (N > 0);

		for (int i = stack.size() - 1; i >= 0; i--) {
			if (stack.elementAt(i) == 1) {
				if (max <= cnt)
					max = cnt;
				cnt = 0; // �ʱ�ȭ �ؾ��� �� ū ���� ���� ���� �����ϱ�
			} else {
				cnt += 1;
			}
		}
		return max;
	}
}

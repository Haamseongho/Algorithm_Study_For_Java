package ť;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ����_���� {

	private static Scanner scanner;
	private static int[] dx = { 1, -1, 0, 0 };
	private static int[] dy = { 0, 0, 1, -1 };
	private static Queue<Integer> queue;
	private static int[] dist;
	private static final int MAX = 10001;
	private static String puzzleAns;
	private static HashMap<Integer, Integer> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int start = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int tmp = scanner.nextInt(); // ���� �־��ֱ�
				if (tmp == 0)
					tmp = 9;

				start = start * 10 + tmp; // �ڸ��� �� ĭ�� �̵��ؾ��ϹǷ� *10�� ���� ���Դϴ�.
			}
		}


		queue = new LinkedList<>();
		map = new HashMap<Integer, Integer>();

		queue.add(start);
		map.put(start,0);
		// ó�� ���� ���� ť�� �ְ� �̵��� ��Ų��.
		// 193 / 425 / 786 (�̷��� ������ �� �� �ִµ� i�� 0�϶� 193 ����, 1�ϋ� 425 ����, 2�϶� 786 �����Դϴ�.
		// j�� �� �׷��� ��ҵ��� ������ �� �ִ�. �������, i*3+j�ε� i�� 1�̰� j�� 2��� ���� 5�� ���� ���̴�.

		while (!queue.isEmpty()) {
			// 9�� ������ ��ġ�� ã�Ƽ� ��ġ�� ã�� �ش� ��ġ�� �������� x,y�� ��ġ�� ã�´�.
			// x,y�� ��ġ�� ã�� �ڿ� �� �ε����� 9�� ���� �̵���Ų��.
			// �̵���Ű�鼭 9�� ���� �ϴ����� �� �� �ֵ��� ����ؼ� swap���ش�.

			int nowNum = queue.remove(); // ���� �ִ� ��ġ�� ���� : 193425786
			String now = String.valueOf(nowNum); // 193425786�� ���ڿ��� ���� �ڿ� ���⼭ 9�� ã�´�.
			int nine = now.indexOf('9'); // 9�� �ִ� ���� �ε����� ã�´�.
			int x = nine / 3;
			int y = nine % 3;
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if ((nx >= 0 && nx < 3) && (ny >= 0 && ny < 3)) {
					// ���� ���� �־����
					/*
					 * ���� �ؾ��� ���� ���� ������ ��带 ã�´�. 3*x + y �� ���� ���� nx*3 + ny�� ���� ��ġ ����������մϴ�.
					 * 
					 */
					StringBuilder next = new StringBuilder(now); // ���� ��ġ�� ���ڿ� ���� StringBuilder�� ���ؼ� �����.
					char temp = next.charAt(x * 3 + y); // �� ���� �ִ� ���� temp�� �־�ΰ� (�ش� �ε����� �ִ� ����)
					next.setCharAt(x * 3 + y, (char) next.charAt(nx * 3 + ny)); // nx*3+ny�� �ε����� ���� ���� ������ �ȴ�.
					next.setCharAt(nx * 3 + ny, temp); // nx*3+ny�� �ε��� �ʿ� temp(x*3+y)�� �ε����� ���� ���� ���� �־ �Ѱ��ش�.
					// �����Ͽ��� �� next�� queue�� �־��ְ� Map�� Ű���ٰ���
					int num = Integer.parseInt(next.toString());
					if (!map.containsKey(num)) {
						map.put(num, map.get(nowNum) + 1);
						queue.add(num);
					}
				}
			}
		}
		if(map.containsKey(123456789)) {
			System.out.println(map.get(123456789));
		}else {
			System.out.println("-1");
		}
	}
}

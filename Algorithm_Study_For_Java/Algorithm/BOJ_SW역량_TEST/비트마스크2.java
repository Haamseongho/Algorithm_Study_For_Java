package algorithm;

import java.io.StringWriter;
import java.util.Scanner;

public class ��Ʈ����ũ2 {

	static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		StringWriter answer = new StringWriter();
		int N = scanner.nextInt(); // �Է� Ƚ�� �����ϱ�
		int bit_set = 0;

		while (N > 0) {
			String str = scanner.next();

			if ("add".equals(str)) {
				int nm = scanner.nextInt();
				bit_set = bit_set | (1 << nm);
			} else if ("remove".equals(str)) {
				int nm = scanner.nextInt();
				bit_set = bit_set & ~(1 << nm);
			} else if ("toggle".equals(str)) {
				int nm = scanner.nextInt();
				bit_set = bit_set ^ (1 << nm);
			} else if ("check".equals(str)) {
				int nm = scanner.nextInt();
				if ((bit_set & (1 << nm)) == 0) {
					// �������� �ʴ� ���
					answer.append("0\n");
				} else {
					answer.append("1\n");
				}
			} else if ("all".equals(str)) {
				bit_set = (1 << 21) - 1; // ��ü ���� 21�̹Ƿ�
				bit_set = bit_set & ~(1); // 1�� �ݴ�� 0�̹Ƿ� ������ �ռ��� 1���µ� ..
			} else if ("empty".equals(str)) {
				bit_set = 0;
			}
			N--;
		}

		System.out.println(answer);
	}

}

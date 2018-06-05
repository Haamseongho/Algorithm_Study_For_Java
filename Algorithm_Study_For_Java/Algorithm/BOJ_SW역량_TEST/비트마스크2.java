package algorithm;

import java.io.StringWriter;
import java.util.Scanner;

public class 비트마스크2 {

	static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		StringWriter answer = new StringWriter();
		int N = scanner.nextInt(); // 입력 횟수 정리하기
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
					// 존재하지 않는 경우
					answer.append("0\n");
				} else {
					answer.append("1\n");
				}
			} else if ("all".equals(str)) {
				bit_set = (1 << 21) - 1; // 전체 수가 21이므로
				bit_set = bit_set & ~(1); // 1의 반대는 0이므로 어차피 앞서서 1뺏는데 ..
			} else if ("empty".equals(str)) {
				bit_set = 0;
			}
			N--;
		}

		System.out.println(answer);
	}

}

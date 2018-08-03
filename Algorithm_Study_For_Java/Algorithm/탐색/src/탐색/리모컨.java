package 탐색;

import java.util.Scanner;

public class 리모컨 {
	static boolean[] broken;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		int channel = scanner.nextInt();
		int brokenN = scanner.nextInt(); // 고장난 키보드의 갯수
		int[] fakeNum = new int[brokenN];
		broken = new boolean[10];

		for (int i = 0; i < brokenN; i++) {
			fakeNum[i] = scanner.nextInt(); // 고장난 버튼 체크
			broken[fakeNum[i]] = true;
		}
		// 6,7,8 일경우 broken[6] = true , broken[7] = true , broken[8] = true

		int answer = channel - brokenN; // 옮겨갈 채널 - 고장난 키보드의 수
		if (answer < 0) {
			answer = Math.abs(answer);
		}

		for (int i = 0; i <= 1000000; i++) {
			// 이동 가능한 채널의 수 500,000 (위로 이동 가능) , (아래로 이동 가능) 따라서 500,000*2
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = c - channel; // 전체에서 옮길 채널 빼주기 ( 예를 들어 500번이고 옮길 채널이 342면 500 - 342 만큼 버튼을 누름
				if (press < 0)
					press = -press;

				if (answer > len + press) {
					answer = len + press;
				}
			}
		}
		System.out.print(answer);
	}

	static int possible(int c) {

		// 0,1,2,3,4,5,6,7,8,9
		if (c == 0) {
			if (broken[0])
				return 0;
			else
				return 1;
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0; // 깨짐 --> 사용 불가능
			}
			len += 1; // 예를 들어, 5번이 깨져 있지 않다면 해당 길이 1만큼 증가
			c /= 10;
		}

		return len;
	}
}

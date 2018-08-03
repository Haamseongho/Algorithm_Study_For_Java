package algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryGap {

	static ArrayList<Integer> dataList;

	public static void main(String[] args) {
		// BinaryGap
		/*
		 * N 값을 나누는데 몫이 0이 될 때 나누는 행위를 그만 둔다. 나머지는 계속해서 문자열로 더해줍니다. charAt함수르 이용하여 1이 나올
		 * 때부터 0의 갯수를 카운팅하고 만약 1이 나왔는데 또 1이 나오면 boolean값을 바꿔서 다시 1을 찾도록 한다.
		 */
		System.out.print(solution(1041));
	}
	// 0이 가장 긴 거 뽑아주는거넴

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
				cnt = 0; // 초기화 해야함 더 큰 것이 있을 수도 있으니까
			} else {
				cnt += 1;
			}
		}
		return max;
	}
}

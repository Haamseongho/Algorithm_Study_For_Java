package 탐색;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class 로또 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		// 나열할 숫자의 갯수
		int[] input_arr = new int[K];

		int[] d = new int[K];
		// S = {1,2,3,5,8,13,21,34}
		// 여기서 6개만 뽑아서 나열한 다음에 쭉 그 과정을 출력하면 됩니다.

		for (int i = 0; i < K; i++)
			input_arr[i] = scanner.nextInt();

		Arrays.sort(input_arr); // 선 오름차순 정리

		for (int i = 0; i < K - 6; i++)
			d[i] = 0;

		for (int i = K - 6; i < K; i++)
			d[i] = 1;

		// d배열을 가지고 순열을 통해서 알아서 나열하고 나열된 값 , 즉 Key값으로 값들을 가지고 와서 데이터 불러와서 벡터에 넣기 (컬랙션)
		// 뭉텅이로 벡터에 넣는 개념임
		Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
		do {
			Vector<Integer> S = new Vector<Integer>();
			for (int j = 0; j < K; j++) {
				if (d[j] == 1)
					S.add(input_arr[j]); // S자체를 ans에 넣을 것이기 떄문에 S내의 전체의 값이 ans의 하나의 키 값에 값으로 들어간다.
			}
			ans.add(S);
		} while (next_permutation(d));

		for (int i = ans.size() - 1; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println("");
		}

	}

	private static boolean next_permutation(int[] A) {
		int i = A.length - 1;
		while (i > 0 && A[i - 1] >= A[i]) {
			i -= 1;
		}

		if (i <= 0)
			return false;

		int j = A.length - 1;

		while (A[i - 1] >= A[j]) {
			j -= 1;
		}

		int tmp = A[i - 1];
		A[i - 1] = A[j];
		A[j] = tmp;

		j = A.length - 1;
		while (i < j) {
			int tmp2 = A[i];
			A[i] = A[j];
			A[j] = tmp2;
			i += 1;
			j -= 1;
		}

		return true;
	}
}

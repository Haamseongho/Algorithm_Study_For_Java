package algorithm;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 6, 1, 4, 6, 3, 2, 7, 4 };
		System.out.print(solution(A, 3, 2));
	}

	public static int solution(int[] A, int K, int L) {
		int sum = 0;
		int max = 0;
		int j;
		for (int i = 0; i < K; i++) {
			do {
				j = i;
				if (j == K - 1)
					K += 1;
				if (K == A.length - 1)
					break;
			} while (K > j);
			

		}return 0;
}}

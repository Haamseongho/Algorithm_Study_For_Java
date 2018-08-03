package algorithm;

public class solution1 {
	static int cnt = 0;
	static int[] A1 = { 5, 3, 7, 7, 10 };;
	static int[] B1 = { 1, 6, 6, 9, 9 };;

	public static void main(String[] args) {

		System.out.println(solution(A1, B1));
	}

	static int solution(int[] A, int[] B) {
		int indexA = 0;
		int temp;

		for (int i = 0; i < A.length; i++) {
			temp = 0;

			for (int j = 0; j < A.length - (i + 1); j++) {
				if (A[j] >= A[j + 1]) {
					indexA = j + 1;
					cnt++;

					temp = A[indexA];
					A[indexA] = B[indexA];
					B[indexA] = temp;

				}
			}

		}

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length - (i + 1); j++) {
				if (A[j] >= A[j + 1]) {
					return -1;
				}
			}
			
		}

		return cnt;
	}
}

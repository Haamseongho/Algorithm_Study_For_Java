import java.util.Arrays;

public class PermCheck {
	static int solution(int[] A) {
		Arrays.sort(A);
		int chg_arr[] = new int[A.length + 1];
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				chg_arr[i] = A[i];
			} else {
				continue;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (chg_arr[i] == (i + 1)) {
				result = 1;
			} else {
				result = 0;
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 5, 7, 3, 2, 7, 3, 1, 10, 8 };
		System.out.print(solution(arr));
	}

}

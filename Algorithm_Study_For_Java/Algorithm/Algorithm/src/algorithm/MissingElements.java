package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MissingElements {
	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 5 };
		System.out.print(solution(A));
	}

	public static int solution(int[] A) {
		int result = 0;
		int arr[] = new int[A.length+1]; // 초기 값은 0으로 다 정리

		for (int i = 0; i < A.length; i++) {
			arr[i] = 0;
		}

		// 값이 배열 인자로 들어가는 것이기 때문에 기본적으로 0부터 시작하니까
		// -1을 해주고 들어가는 것.
		// 모두 0으로 초기화한 상황에서 (값에 대한 인자)의 값 (arr)을 하나씩 증가시킨다.
		// 증가가 안된 놈을 찾아서 그 값의 +1을 해주면 키 값을 구할 수 있음!
		// 그 키 값이 결국 찾고자 하는 값이 되게 됩니다. 
		for (int i = 0; i < A.length; i++) {
			arr[A[i]-1] += 1;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				result = j + 1;
			}
		}

		return result;
	}
}

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
		int arr[] = new int[A.length+1]; // �ʱ� ���� 0���� �� ����

		for (int i = 0; i < A.length; i++) {
			arr[i] = 0;
		}

		// ���� �迭 ���ڷ� ���� ���̱� ������ �⺻������ 0���� �����ϴϱ�
		// -1�� ���ְ� ���� ��.
		// ��� 0���� �ʱ�ȭ�� ��Ȳ���� (���� ���� ����)�� �� (arr)�� �ϳ��� ������Ų��.
		// ������ �ȵ� ���� ã�Ƽ� �� ���� +1�� ���ָ� Ű ���� ���� �� ����!
		// �� Ű ���� �ᱹ ã���� �ϴ� ���� �ǰ� �˴ϴ�. 
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

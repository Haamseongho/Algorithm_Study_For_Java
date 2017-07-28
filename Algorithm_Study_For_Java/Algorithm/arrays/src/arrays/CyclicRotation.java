package arrays;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class CyclicRotation {

	public static int[] solution(int[] A, int k) {
		int chgArr[] = new int[A.length];
		int index = 0;
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		int lastDex = 0;
		for (int i = 0; i < A.length; i++) {
			if (i + k < A.length) {
				index += 1;
				deque.add(A[i]); // �迭�� ������ �Ѿ�� �� ���빰 Deque�� �״�� add(�ڿ������� ä����)
				// System.out.println(deque.pop()); // push�� unshift�� ���� ���ҷ� �ڿ���
				// ����
				// ä������.
			} else {
				lastDex = chgArr.length - 1;
				lastDex = lastDex - i + index;
				deque.push(A[lastDex]); // �迭�� ������ �Ѿ ���빰�� �迭 ������ ������ �ڿ��� ����
				// Ǫ���ϵ��� �����Ѵ�. --> Ǫ���� �տ������� ä����
				// System.out.println(deque.pop());
			}
		}

		for (int j = 0; j < chgArr.length; j++) {
			chgArr[j] = deque.pop(); // deque�� �� �ʺ��� ���빰�� ������ ����.
		}
		
		for (int j = 0; j < chgArr.length; j++) {
			System.out.print(chgArr[j]+"/"); // deque�� �� �ʺ��� ���빰�� ������ ����.
		}

		return chgArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,1,2,3,5};
		solution(arr, sc.nextInt()); // �̵� Ƚ�� �Է�
	}

}
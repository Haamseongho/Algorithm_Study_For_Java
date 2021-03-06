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
				deque.add(A[i]); // 배열의 범위가 넘어가기 전 내용물 Deque에 그대로 add(뒤에서부터 채워짐)
				// System.out.println(deque.pop()); // push는 unshift와 같은 역할로 뒤에서
				// 부터
				// 채워진다.
			} else {
				lastDex = chgArr.length - 1;
				lastDex = lastDex - i + index;
				deque.push(A[lastDex]); // 배열의 범위가 넘어간 내용물은 배열 인자의 순서를 뒤에서 부터
				// 푸쉬하도록 진행한다. --> 푸쉬는 앞에서부터 채워짐
				// System.out.println(deque.pop());
			}
		}

		for (int j = 0; j < chgArr.length; j++) {
			chgArr[j] = deque.pop(); // deque의 앞 쪽부터 내용물을 끄집어 낸다.
		}
		
		for (int j = 0; j < chgArr.length; j++) {
			System.out.print(chgArr[j]+"/"); // deque의 앞 쪽부터 내용물을 끄집어 낸다.
		}

		return chgArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,1,2,3,5};
		solution(arr, sc.nextInt()); // 이동 횟수 입력
	}

}

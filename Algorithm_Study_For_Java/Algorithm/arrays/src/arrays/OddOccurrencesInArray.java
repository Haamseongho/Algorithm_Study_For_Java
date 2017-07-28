package arrays;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class OddOccurrencesInArray {

	public static int solution(int[] A) {
		HashSet<Integer> hashMap = new HashSet<>();
		// HashSet --> Collection의 일종으로 List랑 같은 개념
		// 데이터를 하나의 세트로 넣어두는 개념이라 생각하면 된다. (자료형에 맞게)

		for (int i = 0; i < A.length; i++) {
			if (hashMap.contains(A[i])) {
				hashMap.remove(A[i]);
			} else { 
				hashMap.add(A[i]);
			/*
			 * 처음에는 hashMap이 비어있으므로 첫 데이터는 입력된다.
			 * 이 후 부터는 이미 HashMap에 존재한 데이터이기 때문에 같은 데이터를 지우게 된다.
			 * 예: A[0] = 9; / A[1] = 3 / A[2] = 9 일 경우
			 * A[0],A[1]은 이미 HashMap에 저장된 상태이고 i가 2일 때 9가 되므로 
			 * HashMap에 이미 존재하는 데이터이기 때문에 HashMap내의 9가 지워지게된다.
			 * 이 런식으로 진행하다보면 결국 같은 쌍이 없는 데이터만이 HashMap에 남게 된다.
			 */
			}
		}

		Iterator<Integer> iterator = hashMap.iterator(); // 위치 선언 중요함
		// Iterator는 HashMap 내에 저장된 객체들을 불러온다.
		return iterator.next(); // 저장된 값이 있을 경우 그것을 반환 한다.
	}

	public static void main(String[] args) {
		int[] arr = {};
		System.out.print(solution(arr));
	}
}

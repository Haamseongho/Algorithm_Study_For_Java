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
			if(hashMap.contains(A[i])){
				System.out.print(hashMap.size());
				hashMap.remove(A[i]);
			}
			else
				hashMap.add(A[i]);
		}
		
		Iterator<Integer> iterator = hashMap.iterator(); // 위치 선언 중요함 
		// Iterator는 HashMap 내에 저장된 객체들을 불러온다.
		return iterator.next();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 5, 7, 9, 1, 3, 1, 3 };
		System.out.print(solution(arr));
	}
}

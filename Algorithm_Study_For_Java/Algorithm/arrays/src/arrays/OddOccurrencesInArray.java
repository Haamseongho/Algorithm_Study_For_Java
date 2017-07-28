package arrays;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class OddOccurrencesInArray {

	public static int solution(int[] A) {
		HashSet<Integer> hashMap = new HashSet<>();
		// HashSet --> Collection�� �������� List�� ���� ���� 
		// �����͸� �ϳ��� ��Ʈ�� �־�δ� �����̶� �����ϸ� �ȴ�. (�ڷ����� �°�)
		
		for (int i = 0; i < A.length; i++) {
			if(hashMap.contains(A[i])){
				System.out.print(hashMap.size());
				hashMap.remove(A[i]);
			}
			else
				hashMap.add(A[i]);
		}
		
		Iterator<Integer> iterator = hashMap.iterator(); // ��ġ ���� �߿��� 
		// Iterator�� HashMap ���� ����� ��ü���� �ҷ��´�.
		return iterator.next();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 5, 7, 9, 1, 3, 1, 3 };
		System.out.print(solution(arr));
	}
}

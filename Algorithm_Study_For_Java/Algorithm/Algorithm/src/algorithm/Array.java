package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Array {

	public static void main(String[] args) {
		int A[] = { 1,2,3,4 };
		solution(A, 3);
	}

	static int[] solution(int[] A, int K) {
		int[] arr = A;
		int count = K;
		if (arr.length == 0)
			return arr;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = arr.length - 1; i >= 0; i--)
			queue.add(arr[i]);
		
		
		
		
		for(int i = 0; i <count;i++) {
			int temp = queue.poll();
			queue.add(temp);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = queue.poll();
		}
		
		

		return arr;
	}
}

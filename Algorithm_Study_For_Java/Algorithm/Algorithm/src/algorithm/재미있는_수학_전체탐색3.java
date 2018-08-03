package algorithm;

import java.util.ArrayList;

public class 재미있는_수학_전체탐색3 {

	public static void main(String[] args) {
		
		int[] newArr = solution(30);
		for(int i=0;i<newArr.length;i++)
			System.out.print(newArr[i]+"  /  ");
	}

	static int[] solution(int base) {
		int N;
		N = base - 1;
		ArrayList<Integer> insArr = new ArrayList<Integer>();
		for (int i = 2; i < base; i++) {
			if (N % i == 0) {
				insArr.add(i);
			}
		}

		int[] ansArr = new int[insArr.size()];
		for (int j = 0; j < ansArr.length; j++) {
			ansArr[j] = insArr.get(j);
		}
		
		return ansArr;
	}
}

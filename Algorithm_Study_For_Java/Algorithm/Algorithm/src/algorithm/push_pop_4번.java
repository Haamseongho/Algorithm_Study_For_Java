package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class push_pop_4¹ø {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 0;
		String[] strArr = new String[N];
		while (N > 0) {
			String str = scanner.next();
			if ("push".equals(str)) {
				strArr[i] = "push";
			} else if ("pop".equals(str)) {
				strArr[i] = "pop";
			}
			i++;
			N--;
		}
		int S = scanner.nextInt();
		int[] array = new int[S];

		for (int j = 0; j < array.length; j++) {
			array[j] = scanner.nextInt();
		}

		for (int k = 0; k < array.length; k++) {
			hashMap.put(strArr[k], array[k]);
		}

		for (int j = 0; j < strArr.length; j++) {
			if (strArr[j].equals("push")) {
				
				int max = array[0];
				int min = array[0];
				if (Math.max(max, array[j]) == array[j]) {
					max = array[j];
				}

				if (Math.min(min, array[j]) == array[j]) {
					min = array[j];
				}

				 System.out.println(max * min);

			} else if (strArr[j].equals("pop")) {
				int idx = hashMap.get("pop");
				
				int min_idx = 0;
				for(int k=0;k<array.length;k++) {
					if(array[k] == idx) {
						int temp = array[k];
						array[k] = array[0];
						array[0] = temp;
					}
				}
				int max = array[0];
				int min = array[0];
				if (Math.max(max, array[j]) == array[j]) {
					max = array[j];
				}

				if (Math.min(min, array[j]) == array[j]) {
					min = array[j];
				}

				 System.out.println(max * min);
			}
		}

		
	}

}

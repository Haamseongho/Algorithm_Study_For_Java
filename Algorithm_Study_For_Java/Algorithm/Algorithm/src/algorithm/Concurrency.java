package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Concurrency {

	public static void main(String[] args) {
		
		int[] arr = {9,3,9,3,3,7,7,7,9,7,9};
		System.out.println(solution(arr));
		/*HashSet<Integer> hashSet = new HashSet<>();
		int arr[] = { 9, 3, 9, 3, 3, 9, 7, 9 };
		for (int i = 0; i < arr.length; i++) {
			if (hashSet.contains(arr[i])) {
				hashSet.remove(arr[i]);
			} else {
				// 하나만 있을 경우에는 hashSet에 저장될 것임
				hashSet.add(arr[i]);
			}

		}

		Iterator<Integer> iterator = hashSet.iterator();

		System.out.print(iterator.next());*/
	}
	
	public static int solution(int[] A)
	{
		int[] arr = A;
		int value;
		int result = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		
		for(int i = 0; i< arr.length;i++)
		{
			if(map.get(arr[i]) == null)
				value = 0;
			else
				value = map.get(arr[i]);
			map.put(arr[i], value + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() % 2 != 0)
				result = entry.getKey();
		}
		
		return result;
	}
}

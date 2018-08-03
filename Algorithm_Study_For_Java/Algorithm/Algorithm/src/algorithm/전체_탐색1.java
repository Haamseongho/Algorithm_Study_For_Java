package algorithm;

import java.util.HashMap;

public class 전체_탐색1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] hobby1 = { "축구", "축구", "헬스", "야구" };
		String[] hobby2 = { "농구", "야구", "농구", "축구" };

		int wholeAnswer = wholeEntityCheck(hobby1, hobby2);
		System.out.println(wholeAnswer);
	}

	public static int wholeEntityCheck(String[] first, String[] second) {
		int f_cnt = 0;
		int s_cnt = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// first[i] 관심 영역 모두 0으로 초기화
		// second[i] 관심 영역 모두 0으로 초기화
		for (int i = 0; i < first.length; i++) {
			map.put(first[i], 0);
			map.put(second[i], 0);
		}

		// 관심사가 하나 씩은 있으니까 가져와서 1씩 증가시킴
		// 만약에 second[j]와 first[j]가 같을 경우 (같은 관심사) 관심사가 +1
		for (int j = 0; j < first.length; j++) {
			map.put(first[j], map.get(first[j]) + 1);
			map.put(second[j], map.get(second[j]) + 1);
		}

		int ans = 0;

		for (String key : map.keySet()) {
			ans = Math.max(ans, map.get(key));
		}

		return ans;
		
	}

}

package algorithm;

import java.util.HashMap;

public class Áñ°Å¿îÆÄÆ¼_ÀüÃ¼Å½»ö1 {

	public static void main(String[] args) {
		
		String first[] = {"soccer","baseball","basketball","soccer"};
		String second[] = {"baseball","basketball","soccer","golf"};
		int value = 0;
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
		for(int i=0;i<first.length;i++) {
			hashMap.put(first[i],0);
			hashMap.put(second[i],0);
		}
		
		for(int i=0;i<first.length;i++) {
			hashMap.put(first[i], hashMap.get(first[i]) + 1);
			hashMap.put(second[i], hashMap.get(second[i]) + 1);
		}
		
		int max = 0;
		
		for(String key : hashMap.keySet()) {
			if(max < hashMap.get(key)) {
				max = hashMap.get(key);
			}
		}
		
		System.out.print(max);
	}

}

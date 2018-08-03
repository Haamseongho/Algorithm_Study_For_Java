package algorithm;

import java.util.HashMap;

public class ��ü_Ž��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] hobby1 = { "�౸", "�౸", "�ｺ", "�߱�" };
		String[] hobby2 = { "��", "�߱�", "��", "�౸" };

		int wholeAnswer = wholeEntityCheck(hobby1, hobby2);
		System.out.println(wholeAnswer);
	}

	public static int wholeEntityCheck(String[] first, String[] second) {
		int f_cnt = 0;
		int s_cnt = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// first[i] ���� ���� ��� 0���� �ʱ�ȭ
		// second[i] ���� ���� ��� 0���� �ʱ�ȭ
		for (int i = 0; i < first.length; i++) {
			map.put(first[i], 0);
			map.put(second[i], 0);
		}

		// ���ɻ簡 �ϳ� ���� �����ϱ� �����ͼ� 1�� ������Ŵ
		// ���࿡ second[j]�� first[j]�� ���� ��� (���� ���ɻ�) ���ɻ簡 +1
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

package algorithm;

public class ȸ�� {

	public static void main(String[] args) {
		System.out.println(solution("abab"));
	}

	static int solution(String s) {
		// �ڿ� ��ȯ�� ���� �߰��� ���̱� ������
		for (int i = s.length();; i++) {
			boolean flag = true;
			for (int j = 0; j < s.length(); j++) {
				if (((i - j - 1) < s.length()) && (s.charAt(j) != s.charAt(i - j - 1))) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
			System.out.println(i);
			if (flag)
				return i;
		}
	}
}

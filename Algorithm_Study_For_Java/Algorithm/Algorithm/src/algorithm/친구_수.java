package algorithm;

public class ģ��_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = { "NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN" };

		System.out.println(solution(friends));
	}

	static int solution(String[] friends) {
		int max = 0;
		for (int i = 0; i < friends.length; i++) {
			int cnt = 0;

			for (int j = 0; j < friends[i].length(); j++) {
				if (i == j)
					continue; // ���� ���� �� N�̱� ����

				if (friends[i].charAt(j) == 'Y') {
					// Y �� �� (���� ģ�� ����)
					cnt += 1;
				} else {
					// N �� �� (���� ģ���� �ƴϱ� ������ �������� ģ���� ��)
					for (int k = 0; k < friends.length; k++) {
						// friends[j].charAt(k) --> '��'���� ����
						// friends[k].charAt(i) --> '��'�� ����
						// �������� ã�� ���� ('Y'�� �������� �ִ� ��� ���� ģ���� �Ǳ� ������)
						if (friends[j].charAt(k) == 'Y' && friends[k].charAt(i) == 'Y') {
							cnt += 1;
							break;
						}
					}
				}
			}
			// ���� ū ���� ���ϴ� ���̹Ƿ�
			max = Math.max(max, cnt);
		}
		return max;
	}
}

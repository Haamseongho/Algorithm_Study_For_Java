
public class FrogJmp {

	static int solution(int X, int Y, int D) {

		// X�� ��� ���� D�� X���� �ִ�ġ�� �� �� �ִ� �Ÿ� Y �̻� ���� �Ǹ� �����.
		// X+D+D+ ... >= Y (Y�� �ѵ��� �ٰ� �Ǹ� �������� �����.)
		/*
		 * Y�̻� ���� �����. Y >= D*n + X n�� �Ѱ��ָ� �ǰڳ׿�.. (Y-X)/D + 1 // �̻� �̱� ������ 1��
		 * �߰����ݴϴ�.
		 */
		if ((Y - X) % D == 0) {
			return ((Y - X) / D);
		} else {
			return ((Y - X) / D + 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(solution(10, 85, 30));
	}
}

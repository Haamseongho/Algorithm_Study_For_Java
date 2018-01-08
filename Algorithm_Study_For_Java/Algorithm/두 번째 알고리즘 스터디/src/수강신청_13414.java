import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ������û_13414 {
	static LinkedHashSet<String> stuList;
	private static Scanner scan;
	static int pickNum;
	static int maxNum;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		pickNum = scan.nextInt(); // ���� �ο� �̴� ��
		maxNum = scan.nextInt(); // �ִ� ���� �ο�

		stuList = new LinkedHashSet<String>();
		String stuId;
		// LinkedHashSet<Element>
		// Set�� Ư�� �� �ߺ��� ���� �߰����� �ʽ��ϴ�. �׷����� Linked�� ���� ������ ������ �ֱ� ������ �Է��� ���� ������
		// ����մϴ�.(��峢���� ����)
		for (int i = 0; i < maxNum; i++) {
			stuId = scan.next(); // �й� �Է�
			// Set�� ������ �ȵǾ� �ִ� ��� �߰����ֱ�
			if (stuList.contains(stuId)) {
				stuList.remove(stuId);
			}
			stuList.add(stuId);
		}
		// stuList�� �ߺ��� ���� ���� �ʾ����״ϱ� �״�� ������ָ� �˴ϴ�.
		Iterator<String> it = stuList.iterator();
		// Iterator ���� �ؼ� �־��ְ� �Ǹ� stuList��� LinkedHashSet�� Iterator�� ��� ����Ǳ�
		// ������ �Ʒ� it.next()�� �ϰ� �Ǹ� �ش� Iterator�� �������� ������ ���� �� �Դϴ�.
		while (it.hasNext() && pickNum != 0) {
			System.out.println(it.next());
			pickNum--;
		}
	}
}

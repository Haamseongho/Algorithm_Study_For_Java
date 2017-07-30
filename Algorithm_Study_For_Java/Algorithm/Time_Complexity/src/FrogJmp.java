
public class FrogJmp {

	static int solution(int X, int Y, int D) {

		// X가 출발 지점 D는 X에서 최대치로 갈 수 있는 거리 Y 이상 가게 되면 멈춘다.
		// X+D+D+ ... >= Y (Y를 넘도록 뛰게 되면 개구리는 멈춘다.)
		/*
		 * Y이상 가면 멈춘다. Y >= D*n + X n을 넘겨주면 되겠네요.. (Y-X)/D + 1 // 이상 이기 때문에 1을
		 * 추가해줍니다.
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

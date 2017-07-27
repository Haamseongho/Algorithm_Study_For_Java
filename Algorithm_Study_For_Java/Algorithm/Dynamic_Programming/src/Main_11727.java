import java.util.Scanner;

public class Main_11727 {
	public static int[] tile;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tile = new int[n+1];
		
		tile[0] = 2;
		tile[1] = 1;
		tile[2] = 3;
		
		for(int i=3;i<=n;i++){
			tile[i] = tile[i-1] + 2*tile[i-2];
			tile[i] %= 10007;
		}
		System.out.println(tile[n]);
	}
}

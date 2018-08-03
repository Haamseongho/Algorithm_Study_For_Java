package algorithm;

public class solution5 {
	static int x[] = new int[100];
	static int y[] = new int[100];
	static int arr[] = new int[100];
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
        int sum;


	}

	static void check(int i, int j) {
		for (int k = 0; k < count; k++) {
			if ((arr[i] == x[k] && arr[j] == y[k]) || (arr[i] == y[k] && arr[j] == x[k]))
				return;
		}
		x[count] = arr[i];
        y[count] = arr[j];
        count++;

	}

}

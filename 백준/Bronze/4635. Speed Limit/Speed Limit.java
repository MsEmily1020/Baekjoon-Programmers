import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;

			int[][] arr = new int[n][2];

			for (int j = 0; j < arr.length; j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
				if(j == arr.length - 1)
					for(int k = j; k >= 1; k--)
						arr[k][1] = arr[k][1] - arr[k - 1][1];
			}

			int sum = 0;
			for (int j = 0; j < arr.length; j++)
				sum += arr[j][0] * arr[j][1];

			System.out.println(sum + " miles");
		}
	}
}

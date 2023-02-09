import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int[][] arr = new int[sc.nextInt()][sc.nextInt()];
			if(arr.length <= 11 || (arr.length >= 12 && arr[0].length < 4)) System.out.println(-1);
			else {
				int cnt = 0;
				for (int j = 0; j < arr.length; j++) {
					for (int k = 0; k < arr[j].length; k++) {
						arr[j][k] = cnt++;
						if(j == 11 && k == 3) System.out.println(cnt);
					}
				}
			}
		}
	}
}
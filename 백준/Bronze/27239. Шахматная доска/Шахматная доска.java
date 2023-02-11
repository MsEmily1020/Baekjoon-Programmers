import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[8][8];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
		}
		
		cnt = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (cnt == arr[i][j]) System.out.println((char)(j + 'a') + "" + (i + 1));
			}
		}
	}
}
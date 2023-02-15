import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = arr[0][0];
		int idx1 = 0, idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((idx1 + 1) + " " + (idx2 + 1));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int[] arr = new int[sc.nextInt()];
			for (int j = 0; j < arr.length; j++)
				arr[j] = sc.nextInt();
			int max = arr[0], min = arr[0];
			for (int j = 0; j < arr.length; j++) {
				if(max < arr[j]) max = arr[j];
				if(min > arr[j]) min = arr[j];
			}
			System.out.println(min + " " + max);
		}
	}
}
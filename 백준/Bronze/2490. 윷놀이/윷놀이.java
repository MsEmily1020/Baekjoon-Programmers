import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int[] arr = new int[2];
			for (int j = 0; j < 4; j++)
				arr[sc.nextInt()]++;

			System.out.println(arr[0] == 1 ? "A" : arr[0] == 2 ? "B" : arr[0] == 3 ? "C" : arr[0] == 4 ? "D" : "E");
		}
	}
}

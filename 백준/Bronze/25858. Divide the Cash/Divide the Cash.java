import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int d = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		int money = d / sum;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] * money);
	}
}
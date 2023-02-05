import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 500, 800, 1000 };
		String[] str = sc.nextLine().split(" ");
		int sum = 5000;
		for (int i = 0; i < str.length; i++)
			sum -= arr[Integer.parseInt(str[i]) - 1];
		System.out.println(sum);
	}
}


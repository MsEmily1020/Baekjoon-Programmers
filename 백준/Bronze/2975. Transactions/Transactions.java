import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String[] str = sc.nextLine().split(" ");
			int[] arr = { Integer.parseInt(str[0]), Integer.parseInt(str[2]) };
			if(arr[0] == 0 && str[1].equals("W") && arr[1] == 0) break;
			System.out.println(str[1].equals("W") ? arr[0] - arr[1] < -200 ? "Not allowed" : arr[0] - arr[1] : arr[0] + arr[1]);
		}
	}
}
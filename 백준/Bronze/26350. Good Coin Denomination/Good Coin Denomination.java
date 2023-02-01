import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String answer = "Good";
			int[] arr = new int[sc.nextInt()];
			
			for (int j = 0; j < arr.length; j++)
				arr[j] = sc.nextInt();
			
			for (int j = 0; j < arr.length; j++) {
				if(j + 1 == arr.length) break;
				if(!(arr[j] * 2 <= arr[j + 1])) answer = "Bad";
			}
			
			System.out.print("Denominations: ");
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[j] + " ");
			System.out.println();
			System.out.println(answer + " coin denominations!");
			System.out.println();
		}
	}
}
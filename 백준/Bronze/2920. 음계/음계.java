import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		String answer = "mixed";
		for (int i = 1; i <= 8; i++)
			if(arr[i - 1] != i) break;
			else if(i == 8) answer = "ascending";
		
		for (int i = 8; i >= 1; i--) 
			if(arr[arr.length - i] != i) break;
			else if(i == 1) answer = "descending";
		
		System.out.println(answer);
	}
}
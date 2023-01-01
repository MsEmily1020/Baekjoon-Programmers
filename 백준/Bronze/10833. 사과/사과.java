import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		
		for(int i = 0; i < arr.length - 1; i++) {
			int student = sc.nextInt();
			int remain_apple = sc.nextInt();
			
			if(remain_apple % student != 0) arr[N] += remain_apple % student;
		}
		
		System.out.println(arr[N]);
	}
}
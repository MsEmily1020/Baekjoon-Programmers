import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String[] str = new String[sc.nextInt()];
			int[] arr = new int[str.length];
			for (int j = 0; j < str.length; j++) {
				str[j] = sc.next();
				arr[j] = sc.nextInt();
			}
			
			int max = arr[0];
			String answer = str[0];
			for (int j = 0; j < arr.length; j++)
				if(arr[j] > max) {
					max = arr[j];
					answer = str[j];
				}
			
			System.out.println(answer);
		}
	}
}
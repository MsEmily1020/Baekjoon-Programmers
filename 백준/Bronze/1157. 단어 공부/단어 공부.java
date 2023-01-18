import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String str = sc.next().toUpperCase();
		
		for (int i = 0; i < str.length(); i++)
			arr[str.charAt(i) - 'A']++;
		
		char answer = '?';
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				answer = (char)(i + 'A');
			}
			
			else if(max == arr[i]) answer = '?';
		}
		
		System.out.println(answer);
	}
}
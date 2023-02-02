import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			char[] ch = sc.next().toCharArray();
			int[] arr = new int[26];
			int sum = 0;

			for (int j = 0; j < ch.length; j++) arr[ch[j] - 'A']++;
			for (int j = 0; j < arr.length; j++)
				if(arr[j] == 0) sum += (j + 65);
			System.out.println(sum);
		}
	}
}
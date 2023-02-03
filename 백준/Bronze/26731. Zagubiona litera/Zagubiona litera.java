import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		char[] ch = sc.next().toCharArray();
		for (int i = 0; i < ch.length; i++)
			arr[ch[i] - 'A']++;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) System.out.println((char)(i + 'A'));
		}
	}
}

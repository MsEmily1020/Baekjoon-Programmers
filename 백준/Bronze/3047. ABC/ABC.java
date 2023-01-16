import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(sc.next().trim());
		
		String str = sc.next();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			char ch = str.charAt(i);
			if(ch == 'A')
				System.out.print(arr[0] + " ");
			if(ch == 'B')
				System.out.print(arr[1] + " ");
			if(ch == 'C')
				System.out.print(arr[2] + " ");
		}
	}
}
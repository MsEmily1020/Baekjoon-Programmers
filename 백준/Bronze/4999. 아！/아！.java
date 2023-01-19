import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch1 = sc.next().toCharArray();
		char[] ch2 = sc.next().toCharArray();
		
		int[] arr = new int[2];
		for (int i = 0; i < ch1.length; i++)
			if(ch1[i] == 'a') arr[0]++;
		
		for (int i = 0; i < ch2.length; i++)
			if(ch2[i] == 'a') arr[1]++;
		
		if(Math.max(arr[0], arr[1]) == arr[0]) System.out.println("go");
		else System.out.println("no");
	}
}
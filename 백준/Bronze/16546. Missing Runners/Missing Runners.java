import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt() - 1];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		int[] ans = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= ans.length; j++) {
				if(arr[i] == j) ans[j - 1]++;
			}
		}
		
		for (int i = 0; i < ans.length; i++) 
			if(ans[i] == 0) System.out.println(i + 1);
	}
}

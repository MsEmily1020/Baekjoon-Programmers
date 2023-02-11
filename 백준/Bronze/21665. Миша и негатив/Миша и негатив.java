import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			String ans1 = sc.next();
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = ans1.charAt(j);
		}
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			String ans2 = sc.next();
			for (int j = 0; j < arr[i].length; j++)
				if(arr[i][j] == ans2.charAt(j)) cnt++;
		}
		System.out.println(cnt);
	}
}
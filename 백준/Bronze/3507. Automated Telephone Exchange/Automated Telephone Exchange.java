import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		for(int i = 0; i <= 99; i++) 
			for(int j = 0; j <= 99; j++) 
				if(i + j == n) cnt++;
		System.out.println(cnt);
	}
}
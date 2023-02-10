import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String[] str = sc.next().split("-");
			if(Integer.parseInt(str[1]) <= 90) cnt++; 
		}
		System.out.println(cnt);
	}
}
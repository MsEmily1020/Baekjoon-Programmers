import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		10.5 / 7.5 / 12 이상
//		55점 이상
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int sum = a + b + c;
			System.out.print(str + " " + sum + " ");
			if(!(a >= 10.5 && b >= 7.5 && c >= 12.0 && sum >= 55)) System.out.println("FAIL");
			else System.out.println("PASS");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int tmp1 = a;
		int b = sc.nextInt();
		int tmp2 = b;
		int c = sc.nextInt();
		int d = sc.nextInt();
		a /= c;
		b /= d;
		if(tmp1 % c != 0) a += 1;
		if(tmp2 % d != 0) b += 1;
		System.out.println(l - Math.max(a, b));
	}
}
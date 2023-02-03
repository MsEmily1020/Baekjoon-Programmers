import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = 100 - Integer.parseInt(str[0]), b = 100 - Integer.parseInt(str[1]);
		int c = 100 - (a + b), d = a * b;
		int q = d / 100, r = d % 100;
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println((c + q) + " " + r);
	}
}

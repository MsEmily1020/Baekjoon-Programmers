import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(!(T >= 12 && T <= 16) || sc.nextInt() == 1)
			System.out.println(280);
		else System.out.println(320);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), AB = sc.nextInt() / 2 + sc.nextInt();
		if(N >= AB) System.out.println(AB);
		else System.out.println(N);
	}
}
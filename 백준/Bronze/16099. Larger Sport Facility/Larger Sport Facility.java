import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long t = sc.nextLong() * sc.nextLong();
			long e = sc.nextLong() * sc.nextLong();
			if(t == e) System.out.println("Tie");
			else if(t > e) System.out.println("TelecomParisTech");
			else System.out.println("Eurecom");
		}
	}
}
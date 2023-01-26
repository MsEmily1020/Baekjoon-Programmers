import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt(), l = sc.nextInt();
		int cow = (w / l) * (h / l);
		System.out.println(cow >= n ? n : cow);
	}
}
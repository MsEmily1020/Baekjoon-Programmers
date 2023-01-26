import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = (sc.nextInt() + sc.nextInt()) % 12;
		System.out.println(h == 0 ? 12 : h);
	}
}
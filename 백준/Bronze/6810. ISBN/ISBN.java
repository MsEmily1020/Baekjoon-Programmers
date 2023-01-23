import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The 1-3-sum is " + (91 + sc.nextInt() + sc.nextInt() * 3 + sc.nextInt()));
	}
}
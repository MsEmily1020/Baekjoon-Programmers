import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String str = sc.next();
		String answer1 = str.substring(0, str.length() / 2);
		String answer2 = str.substring(str.length() / 2);
		
		System.out.println(answer1.equals(answer2) ? "Yes" : "No");
	}
}

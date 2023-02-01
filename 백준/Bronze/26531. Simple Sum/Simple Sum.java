import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.nextLine().toCharArray();
		System.out.println(ch[0] - '0' + ch[4] - '0' == ch[8] - '0' ? "YES" : "NO");
	}
}
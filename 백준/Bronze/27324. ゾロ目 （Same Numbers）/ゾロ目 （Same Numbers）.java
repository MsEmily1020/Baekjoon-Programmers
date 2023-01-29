import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		System.out.println(ch[0] == ch[1] ? 1 : 0);
	}
}
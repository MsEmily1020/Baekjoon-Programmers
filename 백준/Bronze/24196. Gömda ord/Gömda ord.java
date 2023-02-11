import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		System.out.print(ch[0]);
		int len = (int)(ch[0] - 'A') + 1;
		while(len <= ch.length - 1) {
			System.out.print(ch[len]);
			len += (int)(ch[len] - 'A') + 1;
		}
	}
}
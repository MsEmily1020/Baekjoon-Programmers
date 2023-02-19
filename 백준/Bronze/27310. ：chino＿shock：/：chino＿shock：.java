import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.nextLine().toCharArray();
		int sum1 = ch.length, sum2 = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ':') sum1++;
			else if(ch[i] == '_') sum2++;
		}
		System.out.println(sum1 + sum2 * 5);
	}
}
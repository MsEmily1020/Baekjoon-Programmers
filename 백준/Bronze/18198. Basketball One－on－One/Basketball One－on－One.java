import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < ch.length; i+=2) {
			if(ch[i] == 'A') sum1 += ch[i + 1] - '0';
			else sum2 += ch[i + 1] - '0';
		}
		System.out.println(sum1 > sum2 ? 'A' : 'B');
	}
}
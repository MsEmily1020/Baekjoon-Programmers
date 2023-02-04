import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			char[] ch = sc.next().toCharArray();
			System.out.println("String #" + i);
			for (int j = 0; j < ch.length; j++) {
				if(ch[j] == 'Z') System.out.print('A');
				else System.out.print((char)(ch[j] + 1));
			}
			System.out.println();
			System.out.println();
		}
	}
}

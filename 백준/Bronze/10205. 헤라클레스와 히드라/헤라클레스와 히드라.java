import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for (int i = 1; i <= K; i++) {
			int h = sc.nextInt();
			char[] ch = sc.next().toCharArray();
			for (int j = 0; j < ch.length; j++)
				h += ch[j] == 'c' ? 1 : -1;
			
			System.out.println("Data Set " + i + ":");
			System.out.println(h);
			System.out.println();
		}
	}
}
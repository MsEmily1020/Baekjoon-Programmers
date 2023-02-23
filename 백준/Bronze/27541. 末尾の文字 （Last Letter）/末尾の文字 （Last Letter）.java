import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextLine();
		char[] ch = sc.nextLine().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'G' && i == ch.length - 1) break;
			System.out.print(ch[i]);
			if(i == ch.length - 1) System.out.print('G');
		}
	}
}
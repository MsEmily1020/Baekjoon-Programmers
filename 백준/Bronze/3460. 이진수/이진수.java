import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			char[] ch = Integer.toBinaryString(sc.nextInt()).toCharArray();
			for (int j = ch.length - 1; j >= 0; j--)
				if(ch[j] == '1') System.out.print(ch.length - j - 1 + " ");
			System.out.println();
		}
	}
}

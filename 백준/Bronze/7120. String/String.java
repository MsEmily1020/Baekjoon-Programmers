import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] ch = sc.nextLine().toCharArray();
		char n = ch[0];
		System.out.print(n);
		for (int i = 0; i < ch.length; i++)
			if(n != ch[i]) {
				System.out.print(ch[i]);
				n = ch[i];
			}
	}
}

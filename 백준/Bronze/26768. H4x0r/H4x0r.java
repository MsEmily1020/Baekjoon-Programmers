import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			switch(ch[i]) {
			case 'a':
				System.out.print(4);
				break;
				
			case 'e':
				System.out.print(3);
				break;
				
			case 'i':
				System.out.print(1);
				break;
				
			case 'o':
				System.out.print(0);
				break;
				
			case 's':
				System.out.print(5);
				break;
				
			default:
					System.out.print(ch[i]);
			}
		}
	}
}
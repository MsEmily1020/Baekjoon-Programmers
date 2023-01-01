import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		if(str.charAt(0) == 'E') System.out.print('I');
		else System.out.print('E');

		if(str.charAt(1) == 'S') System.out.print('N');
		else System.out.print('S');

		if(str.charAt(2) == 'T') System.out.print('F');
		else System.out.print('T');

		if(str.charAt(3) == 'J') System.out.print('P');
		else System.out.print('J');
	}
}
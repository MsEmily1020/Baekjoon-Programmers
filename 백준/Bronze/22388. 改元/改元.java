import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if(str.equals("#")) break;
			int y = sc.nextInt(), m = sc.nextInt();
			if(y > 31 || (y == 31 && m >= 5)) {
				y -= 30;
				str = "?";
			}
			System.out.println(str + " " + y + " " + m + " " + sc.nextInt());
		}
	}
}
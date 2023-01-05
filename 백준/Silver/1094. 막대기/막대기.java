import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int stick = 64;
		int cnt = 0;
		
		while(X > 0) {
			if(X < stick) stick /= 2;
			else {
				cnt++;
				X -= stick;
			}
		}
		
		System.out.println(cnt);
	}
}

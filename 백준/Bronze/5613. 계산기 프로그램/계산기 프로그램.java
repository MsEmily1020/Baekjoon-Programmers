import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = sc.nextInt();
		while(true) {
			char ch = sc.next().charAt(0);
			if(ch == '=') {
				System.out.println(sum); break;
			}
			
			switch(ch) {
			case '+' :
				sum += sc.nextInt();
				break;
			case '-' :
				sum -= sc.nextInt();
				break;

			case '*' :
				sum *= sc.nextInt();
				break;

			case '/' :
				sum /= sc.nextInt();
				break;
			}
		}
	}
}
